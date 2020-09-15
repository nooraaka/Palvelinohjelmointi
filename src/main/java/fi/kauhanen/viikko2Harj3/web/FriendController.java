package fi.kauhanen.viikko2Harj3.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import fi.kauhanen.viikko2Harj3.domain.Friends;

@Controller
public class FriendController {	

		public ArrayList<String> friends = new ArrayList<String>();
		
		@GetMapping(value = "index")
		public String askName(Model model) {
			model.addAttribute("friends", new Friends());
			return "askFriend";
		
	}
	@PostMapping(value = "save")
	public String insertData(@RequestParam(required = false) String friend, Model model) {
		if (friend != null && friend.length() >= 3) {
			friends.add(friend);
		}
		model.addAttribute("friends", friend);
		return "friendInfo";
	}

}

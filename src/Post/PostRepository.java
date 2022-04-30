package Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PostRepository {
	static List<PostDTO> postList = new ArrayList<>();

	void save(PostDTO pd) {
		postList.add(pd);
		for (int i = 0; i < postList.size(); i++) {
			postList.get(i).setId((long) (i + 1));
		}

	}

	Boolean idCheck(Long id) {
		Boolean check = false;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				check = true;

			}
		}
		return check;
	}

	void findById(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.get(i).setPostHits(postList.get(i).getPostHits() + 1);
				System.out.println(postList.get(i));
			}
		}

	}

	Boolean login(Long id, String password) {
		Boolean check = false;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId()) && password.equals(postList.get(i).getPostPass())) {
				check = true;
			}
		}
		return check;
	}

	void change(Long id, String postTitle, String postContents) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.get(i).setPostTitle(postTitle);
				postList.get(i).setPostContents(postContents);
			}
		}

	}

	void findWriter(String writer) {
		for (int i = 0; i < postList.size(); i++) {
			if (writer.equals(postList.get(i).getPosWriter())) {
				System.out.println(postList.get(i));
			}
		}

	}

	void remove(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.remove(i);
			}
		}
		System.out.println("현재 글 목록");
		for (PostDTO p : postList) {
			System.out.println(p);
		}
	}

	void findAll() {
		
		List<String> writerList = new ArrayList<String>();
		for (PostDTO p : postList ) {
			writerList.add(p.getPosWriter());
		}
		
		Collections.sort(writerList);
		
		String bf = "";
		for(String writer : writerList) {
			if(!bf.equals(writer)) {
				System.out.println(writer);
			}
			bf = writer;
		}
		

	}

}

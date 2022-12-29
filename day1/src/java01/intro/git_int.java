package java01.intro;

public class git_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		echo "# frist-project" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/rohseok/frist-project.git
		git push -u origin main
	}

}

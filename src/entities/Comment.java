package entities;

public class Comment {

		private String text;
		
		public Comment() {//constructor/construtor vazio
			
		}

		public Comment(String text) {// Suorce/Generate Constructor Using Fields
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
}

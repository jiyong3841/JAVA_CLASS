package day14;

class Restaurant{
	void todayMenu() {
		class Menu{
			void showMenu() {
				System.out.println("오늘의 점심특선 : 갈치구이와 쭈꾸미 삼겹살");
			}
		}
		
		Menu menu = new Menu(); // 메서드 안에서만 사용 가능
		menu.showMenu();
	}
}

public class _03_LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant myRestaurant = new Restaurant();
		myRestaurant.todayMenu();
	}

}

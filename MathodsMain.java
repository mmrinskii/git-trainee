package object_oriented;

public class MathodsMain {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.title = "boeing 787";
		plane.capacity = 200;
		plane.speed = 1000;//git test
		
		Plane plane2 = new Plane();
		plane.title = "boeing 787";
		plane.capacity = 200;
		plane.speed = 1000;
		
		int diff = plane2.difference();
		System.out.println(diff);
		Plane plane3 = plane;
		
	}

}

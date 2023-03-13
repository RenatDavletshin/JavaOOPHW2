public class Main {
    public static void main(String[] args) {
        Human human = new Human(100, 100);
        Building building = new Building(100);
        Render render = new Render();
        render.render(building);
        System.out.println("\n");
        render.render(human);

        System.out.println(human);
        System.out.println(building);

    }
}
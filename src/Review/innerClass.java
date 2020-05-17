package Review;

public class innerClass {
    public static void main(String[] args) {
        House myHouse = new House(3,"blue");
        House.Room myroom = myHouse.new Room(true);
        myroom.Shape();
        myHouse.address();
    }
      static class House{
        int roomNum;
        String color;

        public House(int roomNum, String color) {
            this.roomNum = roomNum;
            this.color = color;
        }

          void address(){
            System.out.println("Address is private");
        }
        void balcony(){
            System.out.println("the house has a beautiful balcony");
        }
        class Room{
            boolean furniture;

            public Room(boolean furniture) {
                this.furniture = furniture;
            }

            void Shape(){
                System.out.println("the room is rectangular shape");
            }
        }
    }
}

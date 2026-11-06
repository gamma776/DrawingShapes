public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        
        Turtle drawShapes = new Turtle();
        
for (int i = 0; i < 6; i++) {
   drawShapes.right(60);
   drawShapes.forward(10);
    }
 
        // Task 2: Draw a regular shape many times
 
   drawShapes.up();
   drawShapes.left(90);
   drawShapes.forward(20);
   drawShapes.right(90);
   
   drawShapes.down();

 
   for (int d = 0; d < 10; d++) {
    drawShapes.up();
   drawShapes.left(90);
   drawShapes.forward(20);
   drawShapes.right(90);
   drawShapes.down();
       for (int b = 0; b < 6; b++) { 
       drawShapes.right(60);
   drawShapes.forward(10);
         
  } 
 }
        // Task 3: How many times does Turtle turn!
       drawShapes.up();  
       drawShapes.forward(50);
       drawShapes.right(90);
       drawShapes.forward(200);
       drawShapes.left(90);
       drawShapes.down();
       int totalTurns = 0;
   for (int d = 0; d < 10; d++) {
    drawShapes.up();
   drawShapes.left(90);
   drawShapes.forward(20);
   drawShapes.right(90);
   drawShapes.down();
       for (int b = 0; b < 6; b++) { 
       drawShapes.right(60);
   drawShapes.forward(10);
   totalTurns++;
   
    }
 }
 System.out.println("drawShapes has turned " + totalTurns + " times!");
 


        // Extension 1:


        // Extension 2:

    }
}

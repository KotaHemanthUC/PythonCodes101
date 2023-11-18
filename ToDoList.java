package labs.lab7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Class for creating a priority ToDo list.
 */
public class ToDoList {
	private PriorityQueue<Task> tasks;

	/**
	 * Constructor
	 */
	public ToDoList() {
		tasks = new PriorityQueue<>();
	}

	
	/**
	 * Adds a new task with the given priority and description
	 * 
	 * @param priority		priority of the new task
	 * @param description	description of the new task
	 */
	public void addTask(int priority, String description) {
		tasks.add(new Task(priority, description));
	}

	
	/**
	 * Returns the next highest priority task; if two tasks have the 
	 * same priority, returns either one
	 */
	public Task nextTask() {		
		return tasks.poll();
	}
	
	public static void main(String[] args) {
//    	ToDoList todo = new ToDoList();
    	
//    	todo.addTask(1, "yejin choi");
//        todo.addTask(1, "read book");
//        todo.addTask(1, "wash dishes");
//        todo.addTask(1, "eat lunch");
//        System.out.println(todo.nextTask().getDescription());
////        assertEquals("eat lunch", todo.nextTask().getDescription());
//        todo.addTask(1, "walk dog");
//        System.out.println(todo.nextTask().getDescription());
////        assertEquals("reach book", todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
////        assertEquals("walk god", todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
////        assertEquals("wash dishes", todo.nextTask().getDescription()); 		
//        System.out.println(todo.nextTask().getDescription());
		
    	ToDoList todo = new ToDoList();
    	
//    	todo.addTask(1, "");
//    	todo.addTask(1, "Geoffrey Hinton");
//    	todo.addTask(2, "Ilay Sutskever");
//        todo.addTask(1, "Yejin Choi");
//        todo.addTask(2, "Shreya Rajgopal");
//        assertEquals("", todo.nextTask().getDescription());
//        assertEquals(1, todo.nextTask().getPriority());
//        assertEquals("Yejin Choi", todo.nextTask().getDescription());
//        
//        todo.addTask(1, "Fei Fei le");
//        todo.addTask(2, "Parag Singhal");
        
        
//    	todo.addTask(2, "!");
//    	todo.addTask(2, "@");
//    	todo.addTask(2, "#");
//        todo.addTask(2, "$");
//
//        assertEquals("!", todo.nextTask().getDescription());
//        assertEquals(2, todo.nextTask().getPriority());
//        assertEquals(2, todo.nextTask().getPriority());
//        System.out.println(todo.nextTask().getDescription());        

//    	todo.addTask(2, "#");
//    	todo.addTask(2, "##");
//    	todo.addTask(2, "###");
//        todo.addTask(2, "####");
//
//        assertEquals("#", todo.nextTask().getDescription());
//        assertEquals(2, todo.nextTask().getPriority());
//        assertEquals(2, todo.nextTask().getPriority());
////        assertEquals("####", todo.nextTask().getDescription());
//    	
////        assertEquals("Fei Fei le", todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
////        assertEquals("Shreya Rajgopal", todo.nextTask().getDescription());
////        assertEquals(2, todo.nextTask().getPriority());
//        System.out.println(todo.nextTask().getDescription());		
//        System.out.println(todo.nextTask().getDescription());
//        ToDoList todo = new ToDoList();
//        todo.addTask(4, "");
//        System.out.println(todo.nextTask().getDescription());        
//        assertEquals(-1,todo.nextTask().getDescription());
//        assertNull(todo.nextTask());
//        todo.addTask(8, "Jitendra Malik");
//        todo.addTask(7, "Chris Manning");
//        todo.addTask(6, "Bruce Wayne");
//        todo.addTask(9, "Malik");
//        todo.addTask(9, "Chris");
//        todo.addTask(9, "Wayne");
//        todo.nextTask();
//        todo.nextTask();
//        todo.nextTask();
//        assertEquals("Malik", todo.nextTask().getDescription());
//        assertEquals("Wayne", todo.nextTask().getDescription());
//        assertEquals(5, todo.nextTask().getPriority());
    	
//        todo.addTask(8, "A");
//        todo.addTask(8, "B");
//        todo.addTask(8, "C");
//        todo.addTask(8, "D");
//        todo.addTask(8, "E");
//        todo.addTask(8, "F");
//        System.out.println(todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
//        assertEquals("D", todo.nextTask().getDescription());
//        assertEquals("E", todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
//    	assertNull(todo.nextTask());    	

//        todo.addTask(1, "Geoffrey Hinton");
//        todo.addTask(1, "Yejin Choi");
//        todo.addTask(1, "Fei Fei le");
//        todo.addTask(2, "Sameer Singh");
//        System.out.println(todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());
//        System.out.println(todo.nextTask().getDescription());    	
    	
    	todo.addTask(2, "!");
    	todo.addTask(2, "@");
    	todo.addTask(2, "#");
        todo.addTask(2, "$");

        System.out.println(todo.nextTask().getDescription());
        System.out.println(todo.nextTask().getDescription());
        System.out.println(todo.nextTask().getDescription());
        System.out.println(todo.nextTask().getDescription());    	
    	
	}	
	
//	public void printQueue() {
//		Task[] taskArr = tasks.toArray(new Task[0]);
//		for (Task t : taskArr) {
//			System.out.println(t.getPriority() + ", " + t.getDescription());
//		}
//	}
}
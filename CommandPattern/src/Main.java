import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {

		// 예제 1
//		List<Command> list = new LinkedList<>();
//		
//		list.add(new Command() {
//			
//			@Override
//			public void execute() {
//				System.out.println("작업 1");
//			}
//		});
//		
//		list.add(new Command() {
//			
//			@Override
//			public void execute() {
//				System.out.println("작업 2");
//			}
//		});
//		
//		list.add(new Command() {
//			
//			@Override
//			public void execute() {
//				System.out.println("작업 3");
//			}
//		});
//		
//		for (Command command : list) {
//			command.execute();
//		}
		
		PriorityQueue<Command> queue = new PriorityQueue<Command>();
		
		queue.add(new StringPrintCommand("ABCD"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("A"));
		
		for (Command command : queue) {
			command.execute();
		}
	}

}

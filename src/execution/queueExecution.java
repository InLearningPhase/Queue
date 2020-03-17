package execution;
import definition.queueDefinition;

public class queueExecution {
    public static void main(String[] args) {
        queueDefinition<Integer> execution = new queueDefinition<>();
        for (int i = 0; i < 10; i++) {
            execution.add(i);
        }
        System.out.println(execution.toString());
        execution.poll();
        System.out.println(execution.toString());
        execution.remove();
        System.out.println(execution.toString());
    }
}

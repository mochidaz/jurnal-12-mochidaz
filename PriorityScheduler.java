import java.util.PriorityQueue;

public class PriorityScheduler {

    private PriorityQueue<Schedule> schedules;

    public PriorityScheduler() {
        schedules = new PriorityQueue<>();
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void checkHighestPriority() {
        if (schedules.isEmpty()) {
            System.out.println("Tidak ada jadwal yang tersisa!");
            return;
        }

        Schedule schedule = schedules.peek();
        System.out.printf("Task terdekat yang harus diselesaikan: %s %s", schedule.getName(), schedule.getSubject());
    }

    public void deleteSchedule() {
        if (schedules.isEmpty()) {
            System.out.println("Tidak ada jadwal yang tersisa!");
            return;
        }

        Schedule schedule = schedules.poll();

        System.out.printf("%s %s selesai dilaksanakan.", schedule.getName(), schedule.getSubject());
        if (!schedules.isEmpty()) {
            System.out.printf(" berikutnya %s %s", schedules.peek().getName(), schedules.peek().getSubject());
        }
    }
}

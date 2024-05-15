public class Main {
    public static void main(String[] args) {
        PriorityScheduler jadwal = new PriorityScheduler();

        jadwal.addSchedule(new Schedule(5, "tugas", "ISD"));
        jadwal.addSchedule(new Schedule(8, "rapat", "UKM"));
        jadwal.addSchedule(new Schedule(3, "kuis", "SBD"));

        jadwal.checkHighestPriority();

        System.out.println();

        jadwal.deleteSchedule();
    }
}
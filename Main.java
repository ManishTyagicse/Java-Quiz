public class Main{
    public static void main(String a[]){
        QuestionsService service = new QuestionsService();
        service.playQuiz();
        System.out.println("\nFINAL SCORE\n");
        service.printScore();
    }
}
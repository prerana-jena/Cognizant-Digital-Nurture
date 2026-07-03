package DecoratorPatternExample;
public class DecoratorTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Only:");
        notifier.send("Server is running.");

        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS:");
        smsNotifier.send("Server is running.");

        System.out.println();

        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack:");
        allNotifier.send("Server is running.");
    }
}
package lesson170825.classwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseTrader {

	/*
     *
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 *
	 * 2 What are all the unique cities where the traders work?
	 *
	 * 3 Find all traders from Cambridge and sort them by name.
	 *
	 * 4 Return a string of all traders’ names sorted alphabetically.
	 *
	 * 5 Are any traders based in Milan?
	 *
	 * 6 Print all transactions’ values from the traders living in Cambridge.
	 *
	 * 7 What’s the highest value of all the transactions?
	 *
	 * 8 Find the transaction with the smallest value.
	 */

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        List<Transaction> transactionsIn2011
                = transactions.stream()                                     // get stream
                .filter(t -> t.getYear() == 2011)                           // remove any, that not match 2011 year
                .sorted(Comparator.comparingInt(Transaction::getValue))     // sort
                .collect(Collectors.toList());                              // collect in a List

        System.out.println("Task 1: " + transactionsIn2011.toString());
        System.out.println("---");

        List<String> uniqueCities
                = transactions.stream()                                     // get stream
                .map(t -> t.getTrader())                                    // get all Traders
                .map(t -> t.getCity())                                      // get all Cities
                .distinct()                                                 // take only distinct
                .collect(Collectors.toList());                              // collect in a List

        System.out.println("Task 2: " + uniqueCities.toString());
        System.out.println("---");


        List<Trader> tradersInCambridge
                = transactions.stream()                                             // get stream
                .map(t -> t.getTrader())                                            // get all Traders
                .filter(t -> t.getCity() == "Cambridge")                            // remove any, that not match Cambridge city
                .sorted(Comparator.comparing(Trader::getName, String::compareTo))   // sort in ascending order
                .distinct()                                                         // take only distinct
                .collect(Collectors.toList());                                      // collect in a List

        System.out.println("Task 3: " + tradersInCambridge.toString());
        System.out.println("---");

        String allTradersNames
                = transactions.stream()             // get stream
                .map(t -> t.getTrader())            // get all Traders
                .map(t -> t.getName())              // get all Names
                .distinct()                         // take only distinct
                .sorted(Comparator.naturalOrder())  // sort in ascending order
                .collect(Collectors.joining());     // collect as String

        System.out.println("Task 4: " + allTradersNames);
        System.out.println("---");

        Boolean areThereTradersInMilan
                = transactions.stream()
                .map(t -> t.getTrader())
                .noneMatch(t -> t.getCity() == "Milan");

        System.out.println("Task 5: " + areThereTradersInMilan);
        System.out.println("---");

        List<Integer> transactionsValuesTradersInCambridge
                = transactions.stream()                                 // get stream
                .filter(t -> t.getTrader().getCity() == "Cambridge")    // remove any transactions, that not match Cambridge city
                .map(t -> t.getValue())                                 // get transaction values
                .collect(Collectors.toList());                          // collect in a List

        System.out.println("Task 6: " + transactionsValuesTradersInCambridge);
        System.out.println("---");

        Optional<Integer> maxTransaction
                = transactions.stream()
                .map(t -> t.getValue())
                .reduce(Math::max);

        System.out.print("Task 7: ");
        maxTransaction.ifPresent(System.out::println);
        System.out.println("---");

        Optional<Integer> minTransaction
                = transactions.stream()
                .map(t -> t.getValue())
                .reduce(Math::min);

        System.out.print("Task 8: ");
        minTransaction.ifPresent(System.out::println);
        System.out.println("---");


    }
}

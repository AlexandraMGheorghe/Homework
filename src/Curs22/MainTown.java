package Curs22;

import java.util.LinkedList;

public class MainTown {
    public static void main(String[] args) {

        OrderedList<Town> orderedTownsList = new OrderedList<Town>();
        Town town1 = new Town("Bucuresti", 0);
        Town town2 = new Town("Timisoara", 100);
        Town town3 = new Town("Ploiesti", 30);
        Town town4 = new Town("Arad", 150);
        // populate list with towns:
        orderedTownsList.addInOrderedList( town1);
        orderedTownsList.addInOrderedList( town2);
        orderedTownsList.addInOrderedList( town3);
        orderedTownsList.addInOrderedList( town4);

        System.out.println(orderedTownsList);

    }
}

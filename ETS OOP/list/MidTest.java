package list;

public class MidTest {

    public static void main(String[] args) {
        // --- 8. negateAll ---
        // Create a list, namely initialList: 2, -5, 8, 0
        // Then create negatedList which is the negation of the elements at initialList
        System.out.println("--- 8. [5 points] negateAll ---");
        List initialList = new List(-2, List.nil());
        initialList = ListOps.addtoendr(initialList, 5);
        initialList = ListOps.addtoendr(initialList, -8);
        initialList = ListOps.addtoendr(initialList, 0);
        System.out.print("initialList: ");
        ListOps.printList(initialList);
        System.out.println();
        System.out.print("negatedList is the negation of initialList: ");
        List negatedList = Mid.negateAll(initialList);
        ListOps.printList(negatedList);
        System.out.println();
        System.out.println();
        // --- 8. negateAll ---

        // --- 9. find ---
        // Find the element 8 starting from 0 from listToSearch
        // It is found at position 2
        System.out.println("--- 9. [5 points] find ---");
        List listToSearch = new List(7, List.nil());
        listToSearch = ListOps.addtoendr(listToSearch, 5);
        listToSearch = ListOps.addtoendr(listToSearch, 3);
        listToSearch = ListOps.addtoendr(listToSearch, 8);
        System.out.print("listToSearch: ");
        ListOps.printList(listToSearch);
        System.out.println();
        System.out.print("Finding the position of the first 3 (starting from 0) in listToSearch: ");
        System.out.println(Mid.find(3, listToSearch));
        // Find the element 2 starting from 0 from listToSearch
        // 2 is not found, so it returns -1
        System.out.print("Finding the position of the first 2 (starting from 0) in listToSearch: ");
        System.out.println(Mid.find(2, listToSearch));
        System.out.println();
        // --- 9. find ---

        // --- 10. allPositive ---
        // Check whether all of its elements are positive in list
        System.out.println("--- 10. [5 points] allPositive ---");
        System.out.print("Check whether all of its elements are positive in initialList: ");
        System.out.println(Mid.allPositive(initialList));
        System.out.print("Check whether all of its elements are positive in listToSearch: ");
        System.out.println(Mid.allPositive(listToSearch));
        System.out.println();
        // --- 10. allPositive ---
        
        // --- 11. positives ---
        // Find the positive elements in list
        System.out.println("--- 11. [10 points] positives ---");
        List sampleList = new List(2, List.nil());
        sampleList = ListOps.addtoendr(sampleList, 3);
        sampleList = ListOps.addtoendr(sampleList, -5);
        sampleList = ListOps.addtoendr(sampleList, 8);
        sampleList = ListOps.addtoendr(sampleList, -2);
        System.out.print("sampleList: ");
        ListOps.printList(sampleList);
        System.out.println();
        System.out.print("positiveElements is the positive elements of sampleList: ");
        List positiveElements = Mid.positives(sampleList);
        ListOps.printList(positiveElements);
        System.out.println();
        System.out.println();
        // --- 11. positives ---

        // --- 12. sorted ---
        // Check if positiveElements is sorted
        System.out.println("--- 12. [10 points] sorted ---");
        // sampleList: 2 3 -5 8 -2, so it is not sorted
        System.out.print("sampleList: ");
        ListOps.printList(sampleList);
        Boolean isSorted = Mid.sorted(sampleList);
        String sortedStatus = isSorted ? "sorted" : "unsorted";
        System.out.print(". It is " + sortedStatus);
        System.out.println(" (Increment Order).");
        // positiveElements: 2 3 8, so it is sorted
        System.out.print("positiveElements: ");
        ListOps.printList(positiveElements);
        isSorted = Mid.sorted(positiveElements);
        sortedStatus = isSorted ? "sorted" : "unsorted";
        System.out.print(". It is " + sortedStatus);
        System.out.println(" (Increment Order).");
        System.out.println();
        // --- 12. sorted ---

        // --- 13. merge ---
        // Merging two sorted lists, keep the duplicate copies
        System.out.println("--- 13. [10 points] merge ---");
        System.out.println("Merging two sorted lists");
        List firstList = new List(2, List.nil());
        firstList = ListOps.addtoendr(firstList, 5);
        firstList = ListOps.addtoendr(firstList, 5);
        firstList = ListOps.addtoendr(firstList, 8);
        System.out.print("firstList: ");
        ListOps.printList(firstList);
        System.out.println();
        List secondList = new List(5, List.nil());
        secondList = ListOps.addtoendr(secondList, 7);
        secondList = ListOps.addtoendr(secondList, 8);
        secondList = ListOps.addtoendr(secondList, 9);
        System.out.print("secondList: ");
        ListOps.printList(secondList);
        System.out.println();
        System.out.print("Merging firstList & secondList into mergedList: ");
        List mergedList = Mid.merge(firstList, secondList);
        ListOps.printList(mergedList);
        System.out.println();
        List emptyList = new List(9, List.nil());
        System.out.print("emptyList: ");
        ListOps.printList(emptyList);
        System.out.println();
        System.out.print("Merging firstList & emptyList into mergedWithEmptyList: ");
        List mergedWithEmptyList = Mid.merge(firstList, emptyList);
        ListOps.printList(mergedWithEmptyList);
        System.out.println();
        System.out.println();
        // --- 13. merge ---
        
        // --- 14. removeDuplicate ---
        // Remove duplicate
        System.out.println("--- 14. [10 points] removeDuplicate ---");
        System.out.print("Remove all duplicate copies at mergedList into uniqueList: ");
        List uniqueList = Mid.removeDuplicate(mergedList);
        ListOps.printList(uniqueList);
        System.out.println();
        System.out.println();
        // --- 14. removeDuplicate ---
        
        // --- 15. skip ---
        System.out.println("--- 15. [5 points] skip ---");
        System.out.print("Element 5 skipped at mergedList, assigned into skippedList: ");
        List skippedList = Mid.skip(5, mergedList);
        ListOps.printList(skippedList);
        System.out.println();
        // --- 15. skip ---
    }
}

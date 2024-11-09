package codes;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        String[] tableNames = {"LinearSearch","BinarySearch",
                        "SelectionSort","InsertionSort","BubbleSort","MergeSort","QuickSort","RadixSort",
                        "Push","Pop",
                        "GQEnqueue","GQDequeue",
                        "CQEnqueue","CQDequeue",
                        "DQEnqueueRear","DQDequeueFront","DQEnqueueFront","DQDequeueRear",
                        "SLInsertTail","SLDeleteTail","SLInsertHead","SLDeleteHead","SLInsertPosition","SLDeletePosition",
                        "CLInsertTail","CLDeleteTail","CLInsertHead","CLDeleteHead","CLInsertPosition","CLDeletePosition",
                        "DLInsertTail","DLDeleteTail","DLInsertHead","DLDeleteHead","DLInsertPosition","DLDeletePosition",
                        "Inorder","Preorder","Postorder",
                        "BSTInsert","BSTDelete","BSTSearch",
                        "BFS","DFS",
                        "Prims","Kruskals","Dijkstras","Warshalls"};

        String[][] linearSearch = {
            {"What is the best-case time complexity of linear search?",
            "In which scenario does the best case of linear search occur?",
            "What is the worst-case time complexity of linear search?",
            "Which of the following statements about linear search is true?",
            "In linear search, if the element to be searched is not present in the list, the\n algorithm will:",
            "Which of the following is an advantage of linear search over binary search?",
            "What is the primary disadvantage of using a linear search?",
            "Which of the following data structures can linear search be performed on?",
            "In linear search, what is the maximum number of comparisons required to find an\n element in a list of n elements?",
            "When is linear search preferred over binary search?"},
            {"A) O(n)",
            "A) When the element is found at the last position.",
            "A) O(n)",
            "A) Linear search can only be applied to sorted lists.",
            "A) Return the index -1.",
            "A) Linear search is faster for large lists.",
            "A) It can only be used with integers.",
            "A) Arrays only",
            "A) n/2",
            "A) When the list is sorted"},
            {"B) O(n log n)",
            "B) When the element is found at the first position.",
            "B) O(n log n)",
            "B) Linear search can be applied to both sorted and unsorted lists.",
            "B) Return the index 0.",
            "B) Linear search can work on unsorted lists.",
            "B) It requires the list to be sorted.",
            "B) Linked lists only",
            "B) n-1",
            "B) When the list is unsorted"},
            {"C) O(1)",
            "C) When the element is not in the list.",
            "C) O(1)",
            "C) Linear search is always faster than binary search.",
            "C) Continue searching indefinitely.",
            "C) Linear search requires less memory.",
            "C) It has a high time complexity for large lists.",
            "C) Both arrays and linked lists",
            "C) n",
            "C) When the list is large"},
            {"D) O(log n)",
            "D) When all elements are identical.",
            "D) O(log n)",
            "D) Linear search has a time complexity of O(log n).",
            "D) Crash the program.",
            "D) Linear search has better time complexity.",
            "D) It uses too much memory.",
            "D) Neither arrays nor linked lists",
            "D) n+1",
            "D) When the list is empty"},
            {"C) O(1)",
            "B) When the element is found at the first position.",
            "A) O(n)",
            "B) Linear search can be applied to both sorted and unsorted lists.",
            "A) Return the index -1.",
            "B) Linear search can work on unsorted lists.",
            "C) It has a high time complexity for large lists.",
            "C) Both arrays and linked lists",
            "C) n",
            "B) When the list is unsorted"},
            {"The best-case scenario occurs when the target element is found at the first position of \nthe list, resulting in only one comparison.",
            "The best case occurs when the target element is the first element in the list, requiring\n only one comparison.",
            "In the worst-case scenario, the target element is either at the last position or not \nin the list at all, requiring comparisons with all n elements.",
            "Linear search does not require the list to be sorted, making it applicable to any \ntype of list.",
            "If the target element is not found, linear search typically returns -1 to indicate \nthat the element is not in the list.",
            "Linear search does not require the list to be sorted, unlike binary search which \nonly works on sorted lists.",
            "Linear search has a time complexity of O(n), making it inefficient for large lists \ncompared to other search algorithms like binary search.",
            "Linear search can be performed on any linear data structure, including arrays and\n linked lists.",
            "In the worst case, the algorithm needs to compare the target element with all n\n elements in the list.",
            "Linear search does not require the list to be sorted, making it suitable for \nunsorted lists."}
        }; 
        String[][] binarySearch = {
            {"What is the time complexity of binary search in the worst case?",
            "In which scenario does the worst case of binary search occur?",
            "What is a necessary condition for binary search to be applied?",
            "How many elements are left to search after the first comparison in binary \nsearch?",
            "If a binary search is performed on a sorted list of 16 elements, what is the \nmaximum number of comparisons needed to find an element?",
            "Which of the following is an advantage of binary search over linear search?",
            "What is the primary disadvantage of binary search compared to linear search?",
            "Which of the following data structures can binary search be performed on directly?",
            "In binary search, what is the maximum number of comparisons required to find an \nelement in a list of n elements?",
            "When is binary search preferred over linear search?"},
            {"A) O(n)",
            "A) When the element is found at the first position.",
            "A) The list must be sorted.",
            "A) n/2",
            "A) 2",
            "A) Binary search can work on unsorted lists.",
            "A) It can only be used with integers.",
            "A) Arrays only",
            "A) log2(n)",
            "A) When the list is sorted"},
            {"B) O(n log n)",
            "B) When the element is found at the last position.",
            "B) The list must be unsorted.",
            "B) n-1",
            "B) 3",
            "B) Binary search has a better time complexity.",
            "B) It requires the list to be sorted.",
            "B) Linked lists only",
            "B) n",
            "B) When the list is unsorted"},
            {"C) O(log n)",
            "C) When the element is not in the list.",
            "C) The list must have unique elements.",
            "C) n/4",
            "C) 4",
            "C) Binary search requires less memory.",
            "C) It has a high time complexity.",
            "C) Both arrays and linked lists",
            "C) n/2",
            "C) When the list is small"},
            {"D) O(1)",
            "D) When all elements are identical.",
            "D) The list must contain integers only.",
            "D) n/3",
            "D) 5",
            "D) Binary search is easier to implement.",
            "D) It uses too much memory.",
            "D) Neither arrays nor linked lists",
            "D) n-1",
            "D) When the list is empty"},
            {"C) O(log n)",
            "C) When the element is not in the list.",
            "A) The list must be sorted.",
            "A) n/2",
            "C) 4",
            "B) Binary search has a better time complexity.",
            "B) It requires the list to be sorted.",
            "A) Arrays only",
            "A) log2(n)",
            "A) When the list is sorted"},
            {"Binary search repeatedly divides the search interval in half, leading to a logarithmic \n time complexity.",
            "The worst case occurs when the target element is not in the list, requiring the maximum \nnumber of comparisons.",
            "Binary search requires a sorted list to function correctly.",
            "After the first comparison, binary search eliminates half of the elements, leaving n/2 \nelements to search.",
            "In binary search, the maximum number of comparisons is log2(n). For 16 elements, \nlog2(16) = 4.",
            "Binary search has a time complexity of O(log n), which is better than the O(n) time \ncomplexity of linear search for large lists.",
            "Binary search can only be applied to sorted lists, which is a limitation compared to \nlinear search that works on unsorted lists.",
            "Binary search is typically performed on arrays because they allow direct access to \nelements, while linked lists do not.",
            "The maximum number of comparisons in binary search is the logarithm base 2 of the number\n of elements in the list.",
            "Binary search is efficient and preferred when the list is sorted, as it leverages the sorted\n order to reduce the number of comparisons."}
        };     
        String[][] selectionSort = {
            {
                "What is the time complexity of selection sort in the worst case?",
                "In which scenario does the best case of selection sort occur?",
                "What is the space complexity of selection sort?",
                "Which of the following statements about selection sort is true?",
                "How many swaps does selection sort perform in the worst case for an array \nof n elements?",
                "Which of the following is an advantage of selection sort?",
                "What is the primary disadvantage of selection sort?",
                "In selection sort, after the ith iteration, how many elements are guaranteed \nto be in their final sorted position?",
                "Which of the following sorting algorithms has a similar time complexity to \nselection sort?",
                "When is selection sort preferred over other sorting algorithms?"
            },
            {
                "O(n^2)",
                "When all elements are identical.",
                "O(1)",
                "Selection sort has a time complexity of O(n log n).",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "i + 1",
                "Insertion sort",
                "When memory space is very limited."
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Selection sort is a stable sorting algorithm.",
                "O(n)",
                "It is very fast for large datasets.",
                "It is not in-place.",
                "1",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Selection sort can be used for linked lists.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "i",
                "Quick sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(log n)",
                "When the array has a single element.",
                "O(log n)",
                "Selection sort is not a comparison-based sorting algorithm.",
                "O(1)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "n - i",
                "Bubble sort",
                "When stability is required in sorting."
            },
            {
                "O(n^2)",
                "When the array is already sorted.",
                "O(1)",
                "Selection sort can be used for linked lists.",
                "O(n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "i",
                "Bubble sort",
                "When memory space is very limited."
            },
            {
                "Selection sort has a time complexity of O(n^2) in the worst case because it \ninvolves nested loops: one for selecting the minimum element and one for placing \nit in the correct position.",
                "Even if the array is already sorted, selection sort still performs O(n^2) \ncomparisons, but the number of swaps will be minimized.",
                "Selection sort is an in-place sorting algorithm, meaning it requires only a \nconstant amount of additional memory space, i.e., O(1).",
                "While selection sort can be adapted to work on linked lists, it is generally \nnot used for that purpose due to its inefficiency compared to other sorting \nalgorithms.",
                "Selection sort performs exactly n-1 swaps in the worst case, where n is the \nnumber of elements in the array.",
                "One advantage of selection sort is its low memory requirement since it sorts \nthe array in place.",
                "Selection sort has a time complexity of O(n^2), making it inefficient for large \ndatasets compared to other sorting algorithms like quick sort or merge sort.",
                "After the ith iteration, the first i elements are guaranteed to be in their final \nsorted positions.",
                "Both selection sort and bubble sort have a time complexity of O(n^2) in the worst \ncase.",
                "Selection sort is preferred when memory space is very limited because it is an \nin-place sorting algorithm and requires only O(1) additional memory space."
            }
        };
        String[][]  insertionSort = {  
            {
                "What is the time complexity of insertion sort in the worst case?",
                "In which scenario does the best case of insertion sort occur?",
                "What is the space complexity of insertion sort?",
                "Which of the following statements about insertion sort is true?",
                "How many comparisons does insertion sort perform in the best case for an array \nof n elements?",
                "Which of the following is an advantage of insertion sort?",
                "What is the primary disadvantage of insertion sort?",
                "In insertion sort, after the ith iteration, how many elements are guaranteed to be\n in their final sorted position?",
                "Which of the following sorting algorithms has a similar time complexity to insertion\n sort?",
                "When is insertion sort preferred over other sorting algorithms?"
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Insertion sort is a comparison-based sorting algorithm.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "i",
                "Quick sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Insertion sort is not a stable sorting algorithm.",
                "O(n)",
                "It is very fast for large datasets.",
                "It is not in-place.",
                "1",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "O(n^2)",
                "When all elements are identical.",
                "O(1)",
                "Insertion sort has a time complexity of O(n log n).",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "i + 1",
                "Selection sort",
                "When memory space is very limited."
            },
            {
                "O(log n)",
                "When the array has a single element.",
                "O(log n)",
                "Insertion sort requires additional memory for sorting.",
                "O(1)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "n - i",
                "Bubble sort",
                "When stability is not required in sorting."
            },
            {
                "O(n^2)",
                "When the array is already sorted.",
                "O(1)",
                "Insertion sort is a comparison-based sorting algorithm.",
                "O(n)",
                "It is a stable sorting algorithm.",
                "It has a high time complexity for large lists.",
                "i",
                "Bubble sort",
                "When the dataset is mostly sorted."
            }, 
            {
                "In the worst case, each element must be compared with all the previous elements, \nresulting in a time complexity of O(n^2).",
                "The best case occurs when the array is already sorted, resulting in a time complexity\n of O(n) because each element only needs to be compared once.",
                "Insertion sort is an in-place sorting algorithm, meaning it requires only a constant \namount of additional memory space, i.e., O(1).",
                "Insertion sort is a comparison-based sorting algorithm that sorts elements by repeatedly\n picking the next element and inserting it into the correct position.",
                "In the best case, where the array is already sorted, insertion sort performs O(n) \ncomparisons, one for each element.",
                "Insertion sort is stable because it does not change the relative order of elements \nwith equal keys.",
                "Insertion sort has a time complexity of O(n^2) in the worst case, making it inefficient\n for large datasets.",
                "After the ith iteration, the first i elements are sorted and in their final positions.",
                "Both insertion sort and bubble sort have a time complexity of O(n^2) in the worst case.",
                "Insertion sort is efficient for small datasets and works well for datasets that are already\n or nearly sorted, with a time complexity close to O(n) in such cases."
            }
        };
        String[][] bubbleSort = {
            {
                "What is the time complexity of bubble sort in the worst case?",
                "In which scenario does the best case of bubble sort occur?",
                "What is the space complexity of bubble sort?",
                "Which of the following statements about bubble sort is true?",
                "How many swaps does bubble sort perform in the worst case for an array of n \nelements?",
                "Which of the following is an advantage of bubble sort?",
                "What is the primary disadvantage of bubble sort?",
                "In bubble sort, after the ith iteration, how many elements are guaranteed to be in \ntheir final sorted position?",
                "Which of the following sorting algorithms has a similar time complexity to bubble \nsort?",
                "When is bubble sort preferred over other sorting algorithms?"
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Bubble sort is not a stable sorting algorithm.",
                "O(n)",
                "It is very fast for large datasets.",
                "It is not in-place.",
                "1",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "O(log n)",
                "When the array has a single element.",
                "O(log n)",
                "Bubble sort is not a comparison-based sorting algorithm.",
                "O(1)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "n - i",
                "Insertion sort",
                "When stability is required in sorting."
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Bubble sort is a comparison-based sorting algorithm.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "i",
                "Quick sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(n^2)",
                "When all elements are identical.",
                "O(1)",
                "Bubble sort has a time complexity of O(n log n).",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "i + 1",
                "Selection sort",
                "When memory space is very limited."
            },
            {
                "O(n^2)",
                "When the array is already sorted.",
                "O(1)",
                "Bubble sort is a comparison-based sorting algorithm.",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It has a high time complexity for large lists.",
                "n - i",
                "Selection sort",
                "When the dataset is mostly sorted."
            },
            {
                "Bubble sort has a time complexity of O(n^2) in the worst case because it involves \nnested loops to repeatedly compare and swap adjacent elements.",
                "The best case for bubble sort occurs when the array is already sorted, resulting in\n a time complexity of O(n) because only one pass through the array is needed.",
                "Bubble sort is an in-place sorting algorithm, meaning it requires only a constant \namount of additional memory space, i.e., O(1).",
                "Bubble sort is a comparison-based sorting algorithm that sorts elements by repeatedly\n swapping adjacent elements if they are in the wrong order.",
                "In the worst case, bubble sort performs O(n^2) swaps because each element might need \nto be swapped with every other element.",
                "Bubble sort is stable because it does not change the relative order of elements with \nequal keys.",
                "Bubble sort has a time complexity of O(n^2) in the worst case, making it inefficient \nfor large datasets compared to other sorting algorithms like quick sort or merge sort.",
                "After the ith iteration, the last i elements are guaranteed to be in their final sorted\n positions.",
                "Both bubble sort and selection sort have a time complexity of O(n^2) in the worst case.",
                "Bubble sort is preferred when the dataset is mostly sorted because it can quickly detect\n and finish sorting with a time complexity close to O(n) in such cases."
            }
        };
        String[][] mergeSort = {
            {
                "What is the time complexity of merge sort in the worst case?",
                "In which scenario does the best case of merge sort occur?",
                "What is the space complexity of merge sort?",
                "Which of the following statements about merge sort is true?",
                "How many comparisons does merge sort perform in the worst case for an array \nof n elements?",
                "Which of the following is an advantage of merge sort?",
                "What is the primary disadvantage of merge sort?",
                "In merge sort, how many elements are in each subarray during the merge step?",
                "Which of the following sorting algorithms has a similar time complexity to merge \nsort?",
                "When is merge sort preferred over other sorting algorithms?"
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Merge sort is not a stable sorting algorithm.",
                "O(n)",
                "It is very fast for large datasets.",
                "It is not in-place.",
                "n/2",
                "Quick sort",
                "When the dataset is large."
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Merge sort is a stable sorting algorithm.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "n",
                "Selection sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(log n)",
                "When the array has a single element.",
                "O(log n)",
                "Merge sort is not a comparison-based sorting algorithm.",
                "O(1)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "1",
                "Bubble sort",
                "When stability is required in sorting."
            },
            {
                "O(n^2)",
                "When all elements are identical.",
                "O(n)",
                "Merge sort has a time complexity of O(n log n).",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "2n",
                "Insertion sort",
                "When memory space is very limited."
            },
            {
                "O(n log n)",
                "When the array is already sorted.",
                "O(n)",
                "Merge sort is a stable sorting algorithm.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "n",
                "Quick sort",
                "When the dataset is large."
            },
            {
                "Merge sort has a time complexity of O(n log n) in the worst case because it \ndivides the array into halves and merges them, each merge operation taking O(n) \ntime.",
                "The best case occurs when the array is already sorted, resulting in a time \ncomplexity of O(n log n).",
                "Merge sort is not an in-place sorting algorithm; it requires additional memory\n proportional to the size of the input array, i.e., O(n) space complexity.",
                "Merge sort is stable because it does not change the relative order of elements \nwith equal keys.",
                "Merge sort performs O(n log n) comparisons in the worst case, corresponding to \nthe number of comparisons needed to merge the two halves of the array.",
                "One advantage of merge sort is its efficient time complexity of O(n log n), \nmaking it suitable for large datasets.",
                "Merge sort requires additional memory for merging the subarrays, which can be \na drawback for memory-constrained environments.",
                "During the merge step in merge sort, each subarray contains n elements, and \nmerging two such subarrays requires n comparisons.",
                "Quick sort has a similar time complexity of O(n log n) in the average case, \nmaking it comparable to merge sort.",
                "Merge sort is preferred when the dataset is large and memory space is not a \nconstraint, as it ensures stable and efficient sorting."
            }
        };
        String[][] quickSort = {
            {
                "What is the time complexity of quick sort in the worst case?",
                "In which scenario does the best case of quick sort occur?",
                "What is the space complexity of quick sort?",
                "Which of the following statements about quick sort is true?",
                "How many comparisons does quick sort perform in the worst case for an array \nof n elements?",
                "Which of the following is an advantage of quick sort?",
                "What is the primary disadvantage of quick sort?",
                "In quick sort, which element is chosen as the pivot?",
                "Which of the following sorting algorithms has a similar time complexity to \nquick sort?",
                "When is quick sort preferred over other sorting algorithms?"
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Quick sort is not a comparison-based sorting algorithm.",
                "O(n)",
                "It is very fast for large datasets.",
                "It is not in-place.",
                "First element",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "O(log n)",
                "When the array has a single element.",
                "O(log n)",
                "Quick sort is not a stable sorting algorithm.",
                "O(1)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "Middle element",
                "Bubble sort",
                "When stability is required in sorting."
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Quick sort can be used for linked lists.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "Random element",
                "Selection sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(n^2)",
                "When all elements are identical.",
                "O(1)",
                "Quick sort has a time complexity of O(n log n).",
                "O(n^2)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "Last element",
                "Insertion sort",
                "When memory space is very limited."
            },
            {
                "O(n log n)",
                "When the array is already sorted.",
                "O(log n)",
                "Quick sort is not a stable sorting algorithm.",
                "O(n log n)",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "Random element",
                "Merge sort",
                "When the dataset is large."
            }, 
            {
                "Quick sort has a time complexity of O(n log n) in the worst case because it \ndivides the array into partitions and recursively sorts each partition.",
                "The best case occurs when the array is already sorted, resulting in a time \ncomplexity of O(n log n) due to fewer partitioning steps.",
                "Quick sort is an in-place sorting algorithm with a space complexity of O(log n)\n due to the recursive stack space used for partitioning.",
                "Quick sort is not stable because it can change the relative order of equal \nelements during partitioning and swapping.",
                "Quick sort performs O(n log n) comparisons in the worst case, corresponding \nto the number of comparisons needed to recursively partition and sort the array.",
                "One advantage of quick sort is its efficient time complexity of O(n log n), \nmaking it suitable for large datasets.",
                "The primary disadvantage of quick sort is its worst-case time complexity of \nO(n^2) if the pivot selection is poor, leading to inefficient performance.",
                "In quick sort, the choice of pivot significantly affects performance. Randomly\n choosing the pivot or selecting a median-of-three strategy can help mitigate \nworst-case scenarios.",
                "Merge sort has a similar time complexity of O(n log n), making it comparable to\n quick sort in terms of efficiency.",
                "Quick sort is preferred when the dataset is large and needs to be sorted in place,\n as it offers efficient sorting performance and requires minimal additional \nmemory."
            }
        };
        String[][] radixSort = {
            {
                "What is the time complexity of radix sort in the worst case?",
                "In which scenario does the best case of radix sort occur?",
                "What is the space complexity of radix sort?",
                "Which of the following statements about radix sort is true?",
                "How many passes does radix sort perform for an array of n elements, \neach with k digits?",
                "Which of the following is an advantage of radix sort?",
                "What is a limitation of radix sort?",
                "In radix sort, which digit position is processed first?",
                "Which of the following sorting algorithms has a similar time complexity\n to radix sort?",
                "When is radix sort preferred over other sorting algorithms?"
            },
            {
                "O(n log n)",
                "When the array is sorted in reverse order.",
                "O(n log n)",
                "Radix sort is a stable sorting algorithm.",
                "n",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "Most significant digit",
                "Selection sort",
                "When the dataset is mostly sorted."
            },
            {
                "O(k*n)",
                "When all elements are identical.",
                "O(k)",
                "Radix sort has a time complexity of O(n log n).",
                "log(k)",
                "It is a stable sorting algorithm.",
                "It requires additional memory.",
                "Any digit position",
                "Insertion sort",
                "When memory space is very limited."
            },
            {
                "O(n)",
                "When the array is already sorted.",
                "O(n)",
                "Radix sort is not a comparison-based sorting algorithm.",
                "k",
                "It is very fast for large datasets.",
                "It is not stable.",
                "Least significant digit",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "O(k*n*log(n))",
                "When the array has a single element.",
                "O(log n)",
                "Radix sort is not an in-place sorting algorithm.",
                "k*log(n)",
                "It has a time complexity of O(n log n).",
                "It is difficult to implement.",
                "All digit positions simultaneously",
                "Quick sort",
                "When stability is required in sorting."
            },
            {
                "O(k*n)",
                "When the array is already sorted.",
                "O(n)",
                "Radix sort is not a comparison-based sorting algorithm.",
                "k",
                "It requires only O(1) additional memory space.",
                "It has a high time complexity for large lists.",
                "Least significant digit",
                "Merge sort",
                "When the dataset is large."
            },
            {
                "Radix sort has a time complexity of O(k*n) in the worst case, where k is the \nnumber of digits in the largest number and n is the number of elements, making it \nefficient for sorting integers.",
                "The best case occurs when the array is already sorted, resulting in a time \ncomplexity of O(k*n) due to fewer digit comparisons.",
                "Radix sort is an out-of-place sorting algorithm with a space complexity of O(n),\n primarily for storing temporary arrays during sorting.",
                "Radix sort sorts elements based on individual digits or radix positions, not by \ncomparing elements directly.",
                "Radix sort performs exactly k passes through the array, where each pass sorts the\n elements based on one digit position.",
                "One advantage of radix sort is its ability to handle large datasets efficiently \nwithout using comparison operations.",
                "A limitation of radix sort is its space complexity, which can become significant \nfor large integers or when memory is constrained.",
                "In radix sort, the least significant digit is processed first, followed by subsequent\n higher digits in each pass.",
                "Merge sort has a similar time complexity of O(n*log(n)), making it comparable to radix\n sort in terms of efficiency.",
                "Radix sort is preferred for sorting integers or fixed-length strings when the dataset \nis large and the number of digits or characters is relatively small compared\n to the number of elements."
            }
        };
        String[][] push = {
            {
                "What is the purpose of the push operation in a stack?",
                "Which of the following statements about the push operation is true?",
                "What happens when you attempt to push an element onto a full stack (in a fixed-size \nimplementation)?",
                "In a dynamic stack implementation using arrays, what typically happens when the stack\n is full and a push operation is attempted?",
                "What is the time complexity of the push operation in a stack (for both fixed-size and\n dynamic implementations)?",
                "Which data structure concept is most closely associated with the push operation in a \nstack?",
                "What is pushed onto the stack during a push operation?",
                "Which of the following is a common use case for the push operation in stacks?"
            },
            {
                "To add an element to the top of the stack.",
                "Push operation can only be performed on an empty stack.",
                "A stack overflow error occurs.",
                "The stack is resized to accommodate more elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element from the middle of the stack.",
                "Undo operations in text editors."
            },
            {
                "To check if an element is in the stack.",
                "Push operation can only be performed on a non-empty stack.",
                "The element is added to the stack, but the stack remains full.",
                "An exception is thrown.",
                "O(1) for fixed-size and O(n) for dynamic implementations.",
                "Binary search tree traversal order.",
                "An element that was previously popped from the stack.",
                "Maintaining history in web browsers."
            },
            {
                "To sort elements in the stack.",
                "Push operation cannot be performed on stacks.",
                "The element is added, replacing the oldest element in the stack.",
                "The element is added to the stack.",
                "O(n) for fixed-size and O(1) amortized for dynamic implementations.",
                "Linked list node insertion order.",
                "An element that was never on the stack before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the top of the stack.",
                "Push operation can be performed on both empty and non-empty stacks.",
                "The element is silently discarded.",
                "A new stack is created and the element is added to it.",
                "O(n) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element from the bottom of the stack.",
                "Processing function calls in recursion."
            },
            {
                "To add an element to the top of the stack.",
                "Push operation can be performed on both empty and non-empty stacks.",
                "A stack overflow error occurs.",
                "The stack is resized to accommodate more elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element that was never on the stack before.",
                "Processing function calls in recursion."
            },
            {
                "The push operation adds an element to the top of the stack, allowing new elements \nto be stored and accessed in a Last In, First Out (LIFO) manner.",
                "The push operation can be performed on both empty and non-empty stacks, adding \nflexibility in managing stack operations.",
                "In a fixed-size implementation, attempting to push onto a full stack results in a \nstack overflow error, indicating that the stack cannot accommodate more elements.",
                "In a dynamic stack using arrays, when the stack is full, additional memory may be \nallocated (typically by resizing the array) to allow more elements to be pushed \nonto the stack.",
                "The time complexity of the push operation is O(1) for both fixed-size and dynamic \nimplementations, as it involves a constant-time operation of adding an element to \nthe top of the stack.",
                "The push operation in stacks follows the LIFO principle, where the last element \nadded (pushed) is the first one to be removed (popped).",
                "During a push operation, a new element that was not previously on the stack is added\n to the top of the stack.",
                "One common use case for the push operation is managing function calls in recursion, \nwhere each function call's context (parameters and local variables) is pushed onto\n the call stack."
            }
        };
        String[][] pop = {
            {
                "What is the purpose of the pop operation in a stack?",
                "Which of the following statements about the pop operation is true?",
                "What happens when you attempt to pop from an empty stack?",
                "In a dynamic stack implementation using arrays, what typically happens when \nthe stack becomes less than half full after a pop operation?",
                "What is the time complexity of the pop operation in a stack (for both \nfixed-size and dynamic implementations)?",
                "Which data structure concept is most closely associated with the pop \noperation in a stack?",
                "What is returned during a pop operation?",
                "Which of the following is a common use case for the pop operation in stacks?"
            },
            {
                "To sort elements in the stack.",
                "Pop operation cannot be performed on stacks.",
                "The element is added, replacing the oldest element in the stack.",
                "The stack is resized to accommodate fewer elements.",
                "O(n) for fixed-size and O(1) amortized for dynamic implementations.",
                "Linked list node insertion order.",
                "An element that was previously pushed onto the stack.",
                "Calculating Fibonacci numbers."
            },
            {
                "To add an element to the top of the stack.",
                "Pop operation can only be performed on an empty stack.",
                "A stack underflow error occurs.",
                "The stack is resized to accommodate more elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element from the middle of the stack.",
                "Undo operations in text editors."
            },
            {
                "To remove an element from the top of the stack.",
                "Pop operation can be performed on both empty and non-empty stacks.",
                "The element is silently discarded.",
                "A new stack is created and the element is removed from it.",
                "O(n) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element from the bottom of the stack.",
                "Processing function calls in recursion."
            },
            {
                "To check if an element is in the stack.",
                "Pop operation can only be performed on a non-empty stack.",
                "The element is removed from the stack and returned.",
                "An exception is thrown.",
                "O(1) for fixed-size and O(n) for dynamic implementations.",
                "Binary search tree traversal order.",
                "An element that was previously popped from the stack.",
                "Maintaining history in web browsers."
            },
            {
                "To remove an element from the top of the stack.",
                "Pop operation can only be performed on a non-empty stack.",
                "A stack underflow error occurs.",
                "The stack is resized to accommodate fewer elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element that was previously pushed onto the stack.",
                "Processing function calls in recursion."
            },
            {
                "The pop operation removes the topmost element from the stack, allowing access to the\n most recently added (last in) element.",
                "The pop operation can only be performed on a non-empty stack, as there must be an \nelement to remove.",
                "Attempting to pop from an empty stack results in a stack underflow error, indicating\n that there are no elements to remove.",
                "In a dynamic stack using arrays, if the stack becomes less than half full after a \npop operation, the stack may be resized to free up memory, typically by shrinking the \narray.",
                "The time complexity of the pop operation is O(1) for both fixed-size and dynamic \nimplementations, as it involves a constant-time operation of removing an element from \nthe top of the stack.",
                "The pop operation in stacks follows the LIFO principle, where the last element \nadded (pushed) is the first one to be removed (popped).",
                "During a pop operation, the element that was most recently pushed onto the stack \nis removed and returned for further processing or use.",
                "One common use case for the pop operation is managing function calls in recursion,\n where each function call's context (parameters and local variables) is pushed onto the\n call stack and then popped off as the functions complete."
            }
        };
        String[][] gQEnqueue = {
            {
                "What is the purpose of the enqueue operation in a queue?",
                "Which of the following statements about the enqueue operation is true?",
                "What happens when you attempt to enqueue an element into a full queue?",
                "In a dynamic queue implementation using arrays, what typically happens when \nthe queue is full and an enqueue operation is attempted?",
                "What is the time complexity of the enqueue operation in a queue (for both \nfixed-size and dynamic implementations)?",
                "Which data structure concept is most closely associated with the enqueue \noperation in a queue?",
                "What is enqueued during an enqueue operation?",
                "Which of the following is a common use case for the enqueue operation in \nqueues?"
            },
            {
                "To add an element to the rear of the queue.",
                "Enqueue operation can only be performed on an empty queue.",
                "A queue overflow error occurs.",
                "The queue is resized to accommodate more elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element from the middle of the queue.",
                "Undo operations in text editors."
            },
            {
                "To check if an element is in the queue.",
                "Enqueue operation can only be performed on a non-empty queue.",
                "The element is added to the queue, but the queue remains full.",
                "An exception is thrown.",
                "O(1) for fixed-size and O(n) for dynamic implementations.",
                "Binary search tree traversal order.",
                "An element that was previously dequeued from the queue.",
                "Maintaining history in web browsers."
            },
            {
                "To remove an element from the front of the queue.",
                "Enqueue operation can be performed on both empty and non-empty queues.",
                "The element is silently discarded.",
                "A new queue is created and the element is added to it.",
                "O(n) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element from the bottom of the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "To sort elements in the queue.",
                "Enqueue operation cannot be performed on queues.",
                "The element is added, replacing the oldest element in the queue.",
                "The element is added to the queue.",
                "O(n) for fixed-size and O(1) amortized for dynamic implementations.",
                "Linked list node insertion order.",
                "An element that was never in the queue before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To add an element to the rear of the queue.",
                "Enqueue operation can be performed on both empty and non-empty queues.",
                "A queue overflow error occurs.",
                "The queue is resized to accommodate more elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element that was never in the queue before.",
                "Processing tasks in job scheduling."
            },
            {
                "The enqueue operation adds an element to the rear (or end) of the queue, \nallowing new elements to be stored and accessed in a First In, First Out (FIFO) \nmanner.",
                "The enqueue operation can be performed on both empty and non-empty queues, \nadding flexibility in managing queue operations.",
                "Attempting to enqueue into a full queue results in a queue overflow error, \nindicating that the queue cannot accommodate more elements.",
                "In a dynamic queue using arrays, when the queue is full, additional memory \nmay be allocated (typically by resizing the array) to allow more elements to be \nenqueued.",
                "The time complexity of the enqueue operation is O(1) for both fixed-size and \ndynamic implementations, as it involves a constant-time operation of adding an \nelement to the rear of the queue.",
                "The enqueue operation in queues follows the FIFO principle, where the first \nelement added (enqueued) is the first one to be removed (dequeued).",
                "During an enqueue operation, a new element that was not previously in the queue\n is added to the rear of the queue.",
                "One common use case for the enqueue operation is managing tasks or jobs in job \nscheduling systems, where new tasks are added to the queue and processed in the order they were added."
            }
        };
        String[][]  gQDequeue = {
            {
                "What is the purpose of the dequeue operation in a queue?",
                "Which of the following statements about the dequeue operation is true?",
                "What happens when you attempt to dequeue from an empty queue?",
                "In a dynamic queue implementation using arrays, what typically happens when \nthe queue becomes less than half full after a dequeue operation?",
                "What is the time complexity of the dequeue operation in a queue (for both \nfixed-size and dynamic implementations)?",
                "Which data structure concept is most closely associated with the dequeue \noperation in a queue?",
                "What is dequeued during a dequeue operation?",
                "Which of the following is a common use case for the dequeue operation in \nqueues?"
            },
            {
                "To add an element to the front of the queue.",
                "Dequeue operation can only be performed on an empty queue.",
                "A queue underflow error occurs.",
                "The queue is resized to accommodate fewer elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "LIFO (Last In, First Out)",
                "An element from the middle of the queue.",
                "Undo operations in text editors."
            },
            {
                "To remove an element from the front of the queue.",
                "Dequeue operation can be performed on both empty and non-empty queues.",
                "The element is silently discarded.",
                "A new queue is created and the element is removed from it.",
                "O(n) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element from the bottom of the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "To check if an element is in the queue.",
                "Dequeue operation can only be performed on a non-empty queue.",
                "The element is removed from the queue and returned.",
                "An exception is thrown.",
                "O(1) for fixed-size and O(n) for dynamic implementations.",
                "Binary search tree traversal order.",
                "An element that was firstly enqueued into the queue.",
                "Maintaining history in web browsers."
            },
            {
                "To sort elements in the queue.",
                "Dequeue operation cannot be performed on queues.",
                "The element is added, replacing the oldest element in the queue.",
                "The element is removed from the queue.",
                "O(n) for fixed-size and O(1) amortized for dynamic implementations.",
                "Linked list node insertion order.",
                "An element that was never in the queue before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the front of the queue.",
                "Dequeue operation can only be performed on a non-empty queue.",
                "A queue underflow error occurs.",
                "The queue is resized to accommodate fewer elements.",
                "O(1) for both fixed-size and dynamic implementations.",
                "FIFO (First In, First Out)",
                "An element that was firstly enqueued into the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "The dequeue operation removes the frontmost element from the queue, allowing \naccess to the oldest added (first in) element.",
                "The dequeue operation can only be performed on a non-empty queue, as there \nmust be an element to remove.",
                "Attempting to dequeue from an empty queue results in a queue underflow error,\n indicating that there are no elements to remove.",
                "In a dynamic queue using arrays, if the queue becomes less than half full after\n a dequeue operation, the queue may be resized to free up memory, typically by \nshrinking the array.",
                "The time complexity of the dequeue operation is O(1) for both fixed-size and\n dynamic implementations, as it involves a constant-time operation of removing an \nelement from the front of the queue.",
                "The dequeue operation in queues follows the FIFO principle, where the first \nelement added (enqueued) is the first one to be removed (dequeued).",
                "During a dequeue operation, the element that was most oldly enqueued into the \nqueue is removed and returned for further processing or use.",
                "One common use case for the dequeue operation is managing tasks or jobs in job \nscheduling systems, where the oldest task (or job) is removed and processed next."
            }
        };
        String[][] cQEnqueue = {
            {
                "What is the purpose of the enqueue operation in a circular queue?",
                "Which of the following statements about the enqueue operation in circular \nqueues is true?",
                "What happens when you attempt to enqueue an element into a full circular \nqueue?",
                "In a circular queue implementation using arrays, what typically happens \nwhen the queue is full and an enqueue operation is attempted?",
                "What is the time complexity of the enqueue operation in a circular queue?",
                "Which data structure concept is most closely associated with the enqueue \noperation in a circular queue?",
                "What is enqueued during an enqueue operation in a circular queue?",
                "Which of the following is a common use case for the enqueue operation in \ncircular queues?"
            },
            {
                "To check if an element is in the queue.",
                "Enqueue operation can only be performed on a non-empty circular queue.",
                "The element is added to the queue, but the queue remains full.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was previously dequeued from the queue.",
                "Maintaining history in web browsers."
            },
            {
                "To add an element to the rear of the queue.",
                "Enqueue operation can only be performed on an empty circular queue.",
                "A queue overflow error occurs.",
                "The queue is resized to accommodate more elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the queue.",
                "Undo operations in text editors."
            },
            {
                "To remove an element from the front of the queue.",
                "Enqueue operation can be performed on both empty and non-empty circular queues.",
                "The element is silently discarded.",
                "A new queue is created and the element is added to it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "To sort elements in the queue.",
                "Enqueue operation cannot be performed on circular queues.",
                "The element is added, replacing the oldest element in the queue.",
                "The element is added to the queue.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was never in the queue before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To add an element to the rear of the queue.",
                "Enqueue operation can be performed on both empty and non-empty circular queues.",
                "A queue overflow error occurs.",
                "The queue is resized to accommodate more elements.",
                "O(1)",
                "FIFO (First In, First Out)",
                "An element that was never in the queue before.",
                "Processing tasks in job scheduling."
            },
            {
                "The enqueue operation in a circular queue adds an element to the rear (or end) of \nthe queue, allowing new elements to be stored and accessed in a circular manner.",
                "The enqueue operation can be performed on both empty and non-empty circular queues, \nadding flexibility in managing queue operations.",
                "Attempting to enqueue into a full circular queue results in a queue overflow error, \nindicating that the queue cannot accommodate more elements until some are dequeued.",
                "In a circular queue using arrays, when the queue is full, additional memory may not \nbe allocated (as the size is fixed), and instead, an overflow error is typically \ngenerated.",
                "The time complexity of the enqueue operation in a circular queue is O(1), as it \ninvolves a constant-time operation of adding an element to the rear of the queue.",
                "The enqueue operation in circular queues follows the FIFO principle, where the first\n element added (enqueued) is the first one to be removed (dequeued).",
                "During an enqueue operation in a circular queue, a new element that was not previously\n in the queue is added to the rear of the queue.",
                "One common use case for the enqueue operation in circular queues is managing tasks or\n jobs in job scheduling systems, where new tasks are added to the queue and processed \nin the order they were added."
            }
        };
        String[][]  cQDequeue = {
            {
                "What is the purpose of the dequeue operation in a circular queue?",
                "Which of the following statements about the dequeue operation in circular \nqueues is true?",
                "What happens when you attempt to dequeue from an empty circular queue?",
                "In a circular queue implementation using arrays, what typically happens when \nthe queue becomes less than half full after a dequeue operation?",
                "What is the time complexity of the dequeue operation in a circular queue?",
                "Which data structure concept is most closely associated with the dequeue \noperation in a circular queue?",
                "What is dequeued during a dequeue operation in a circular queue?",
                "Which of the following is a common use case for the dequeue operation in \ncircular queues?"
            },
            {
                "To add an element to the front of the queue.",
                "Dequeue operation can only be performed on an empty circular queue.",
                "A queue underflow error occurs.",
                "The queue is resized to accommodate fewer elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the queue.",
                "Undo operations in text editors."
            },
            {
                "To check if an element is in the queue.",
                "Dequeue operation can only be performed on a non-empty circular queue.",
                "The element is removed from the queue and returned.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was firstly enqueued into the queue.",
                "Maintaining history in web browsers."
            },
            {
                "To remove an element from the front of the queue.",
                "Dequeue operation can be performed on both empty and non-empty circular queues.",
                "The element is silently discarded.",
                "A new queue is created and the element is removed from it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "To sort elements in the queue.",
                "Dequeue operation cannot be performed on circular queues.",
                "The element is added, replacing the oldest element in the queue.",
                "The element is removed from the queue.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was never in the queue before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the front of the queue.",
                "Dequeue operation can be performed on both empty and non-empty circular queues.",
                "A queue underflow error occurs.",
                "The queue is resized to accommodate fewer elements.",
                "O(1)",
                "FIFO (First In, First Out)",
                "An element that was firstly enqueued into the queue.",
                "Processing tasks in job scheduling."
            },
            {
                "The dequeue operation in a circular queue removes the frontmost element from \nthe queue, allowing access to the oldest added (first in) element.",
                "The dequeue operation can be performed on both empty and non-empty circular \nqueues, as long as there are elements to remove.",
                "Attempting to dequeue from an empty circular queue results in a queue underflow\n error, indicating that there are no elements to remove.",
                "In a circular queue using arrays, when the queue becomes less than half full \nafter a dequeue operation, the size of the queue may be reduced or elements may \nbe shifted to reclaim memory.",
                "The time complexity of the dequeue operation in a circular queue is O(1), as it\n involves a constant-time operation of removing an element from the front of the \nqueue.",
                "The dequeue operation in circular queues follows the FIFO principle, where the \nfirst element added (enqueued) is the first one to be removed (dequeued).",
                "During a dequeue operation in a circular queue, the element that was most oldly \nenqueued into the queue is removed and returned for further processing or use.",
                "One common use case for the dequeue operation in circular queues is processing \ntasks or jobs in job scheduling systems, where the oldest task (or job) is removed \nand processed next."
            }
        };
        String[][] dQEnqueueRear = {
            {
                "What is the purpose of the enqueue at rear operation in a double-ended queue \n(deque)?",
                "Which of the following statements about the enqueue at rear operation in deques\n is true?",
                "What happens when you attempt to enqueue at the rear of a full deque?",
                "In a deque implementation using arrays, what typically happens when the deque is\n full and an enqueue at rear operation is attempted?",
                "What is the time complexity of the enqueue at rear operation in a deque?",
                "Which data structure concept is most closely associated with the enqueue at rear\n operation in a deque?",
                "What is enqueued at the rear during an enqueue at rear operation in a deque?",
                "Which of the following is a common use case for the enqueue at rear operation in\n deques?"
            },
            {
                "To add an element to the rear of the deque.",
                "Enqueue at rear operation can only be performed on an empty deque.",
                "A deque overflow error occurs.",
                "The deque is resized to accommodate more elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the deque.",
                "Undo operations in text editors."
            },
            {
                "To check if an element is in the deque.",
                "Enqueue at rear operation can only be performed on a non-empty deque.",
                "The element is added to the deque, but the deque remains full.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was previously dequeued from the deque.",
                "Maintaining history in web browsers."
            },
            {
                "To sort elements in the deque.",
                "Enqueue at rear operation cannot be performed on deques.",
                "The element is added, replacing the oldest element in the deque.",
                "The element is added to the deque.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was never in the deque before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the front of the deque.",
                "Enqueue at rear operation can be performed on both empty and non-empty deques.",
                "The element is silently discarded.",
                "A new deque is created and the element is added to it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "To add an element to the rear of the deque.",
                "Enqueue at rear operation can be performed on both empty and non-empty deques.",
                "A deque overflow error occurs.",
                "The deque is resized to accommodate more elements.",
                "O(1)",
                "FIFO (First In, First Out)",
                "An element that was never in the deque before.",
                "Processing tasks in job scheduling."
            },
            {
                "The enqueue at rear operation in a double-ended queue (deque) adds an element \nto the rear (end) of the deque, allowing new elements to be stored and accessed from \nboth ends.",
                "The enqueue at rear operation can be performed on both empty and non-empty deques,\n allowing flexibility in managing deque operations.",
                "Attempting to enqueue at the rear of a full deque results in a deque overflow \nerror, indicating that the deque cannot accommodate more elements until some are dequeued\n from the front or the rear.",
                "In a deque using arrays, when the deque is full, additional memory may not be \nallocated (as the size is fixed), and instead, an overflow error is typically generated.",
                "The time complexity of the enqueue at rear operation in a deque is O(1), as it \ninvolves a constant-time operation of adding an element to the rear of the deque.",
                "The enqueue at rear operation in deques follows the FIFO (First In, First Out) \nprinciple, where the first element added (enqueued) to the rear is the first one to be \nremoved.",
                "During an enqueue at rear operation in a deque, a new element that was not \npreviously in the deque is added to the rear of the deque.",
                "One common use case for the enqueue at rear operation in deques is managing \ntasks or jobs in job scheduling systems, where new tasks are added to the rear and processed \nin the order they were added."
            },
        };
        String[][]  dQDequeueFront = {
            {
                "What is the purpose of the dequeue at front operation in a double-ended queue\n (deque)?",
                "Which of the following statements about the dequeue at front operation in deques\n is true?",
                "What happens when you attempt to dequeue from the front of an empty deque?",
                "In a deque implementation using arrays, what typically happens when the deque \nbecomes less than half full after a dequeue at front operation?",
                "What is the time complexity of the dequeue at front operation in a deque?",
                "Which data structure concept is most closely associated with the dequeue at \nfront operation in a deque?",
                "What is dequeued at the front during a dequeue at front operation in a deque?",
                "Which of the following is a common use case for the dequeue at front operation \nin deques?"
            },
            {
                "To check if an element is in the deque.",
                "Dequeue at front operation can only be performed on a non-empty deque.",
                "The element is removed from the deque and returned.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was previously enqueued into the deque.",
                "Maintaining history in web browsers."
            },
            {
                "To sort elements in the deque.",
                "Dequeue at front operation cannot be performed on deques.",
                "The element is added, replacing the oldest element in the deque.",
                "The element is removed from the deque.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was previously enqueued at the front of the deque.",
                "Calculating Fibonacci numbers."
            },
            {
                "To add an element to the rear of the deque.",
                "Dequeue at front operation can only be performed on an empty deque.",
                "A deque underflow error occurs.",
                "The deque is resized to accommodate fewer elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the deque.",
                "Undo operations in text editors."
            },
            {
                "To remove an element from the front of the deque.",
                "Dequeue at front operation can be performed on both empty and non-empty deques.",
                "The element is silently discarded.",
                "A new deque is created and the element is removed from it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "To remove an element from the front of the deque.",
                "Dequeue at front operation can only be performed on a non-empty deque.",
                "A deque underflow error occurs.",
                "The deque is resized to accommodate fewer elements.",
                "O(1)",
                "FIFO (First In, First Out)",
                "An element that was previously enqueued at the front of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "The dequeue at front operation in a double-ended queue (deque) removes the \nfrontmost element from the deque, allowing access to the oldest added (first in) element.",
                "Dequeue at front operation can only be performed on a non-empty deque, as \nlong as there are elements to remove from the front.",
                "Attempting to dequeue from the front of an empty deque results in a deque \nunderflow error, indicating that there are no elements to remove.",
                "In a deque using arrays, when the deque becomes less than half full after \na dequeue at front operation, the size of the deque may be reduced or elements \nmay be shifted to reclaim memory.",
                "The time complexity of the dequeue at front operation in a deque is O(1), \nas it involves a constant-time operation of removing an element from the front of\n the deque.",
                "The dequeue at front operation in deques follows the FIFO (First In, First \nOut) principle, where the first element added (enqueued) to the front is the first\n one to be removed.",
                "During a dequeue at front operation in a deque, the element that was most \nrecently enqueued at the front is removed and returned for further processing or use.",
                "One common use case for the dequeue at front operation in deques is processing\n tasks or jobs in job scheduling systems, where the oldest task (or job) is removed\n and processed next."
            }
        };
        String[][]  dQEnqueueFront = {
            {
                "What is the purpose of the enqueue at front operation in a double-ended queue\n (deque)?",
                "Which of the following statements about the enqueue at front operation in deques\n is true?",
                "What happens when you attempt to enqueue at the front of a full deque?",
                "In a deque implementation using arrays, what typically happens when the deque is \nfull and an enqueue at front operation is attempted?",
                "What is the time complexity of the enqueue at front operation in a deque?",
                "Which data structure concept is most closely associated with the enqueue at front \noperation in a deque?",
                "What is enqueued at the front during an enqueue at front operation in a deque?",
                "Which of the following is a common use case for the enqueue at front operation in deques?"
            },
            {
                "To check if an element is in the deque.",
                "Enqueue at front operation can only be performed on a non-empty deque.",
                "The element is added to the deque, but the deque remains full.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was previously dequeued from the deque.",
                "Maintaining history in web browsers."
            },
            {
                "To sort elements in the deque.",
                "Enqueue at front operation cannot be performed on deques.",
                "The element is added, replacing the oldest element in the deque.",
                "The element is added to the deque.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was never in the deque before.",
                "Calculating Fibonacci numbers."
            },
            {
                "To add an element to the front of the deque.",
                "Enqueue at front operation can only be performed on an empty deque.",
                "A deque overflow error occurs.",
                "The deque is resized to accommodate more elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the deque.",
                "Undo operations in text editors."
            },
            {
                "To remove an element from the rear of the deque.",
                "Enqueue at front operation can be performed on both empty and non-empty deques.",
                "The element is silently discarded.",
                "A new deque is created and the element is added to it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "To add an element to the front of the deque.",
                "Enqueue at front operation can be performed on both empty and non-empty deques.",
                "A deque overflow error occurs.",
                "The deque is resized to accommodate more elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element that was never in the deque before.",
                "Processing tasks in job scheduling."
            },
            {
                "The enqueue at front operation in a double-ended queue (deque) adds an element \nto the front of the deque, allowing new elements to be stored and accessed from both\n ends.",
                "The enqueue at front operation can be performed on both empty and non-empty \ndeques, allowing flexibility in managing deque operations.",
                "Attempting to enqueue at the front of a full deque results in a deque overflow\n error, indicating that the deque cannot accommodate more elements until some are \ndequeued from the front or the rear.",
                "In a deque using arrays, when the deque becomes full after an enqueue at front\n operation, additional memory may not be allocated (as the size is fixed), and instead, \nan overflow error is typically generated.",
                "The time complexity of the enqueue at front operation in a deque is O(1), as it\n involves a constant-time operation of adding an element to the front of the deque.",
                "The enqueue at front operation in deques follows the LIFO (Last In, First Out) \nprinciple, where the last element added (enqueued) to the front is the first one to \nbe removed.",
                "During an enqueue at front operation in a deque, a new element that was not \npreviously in the deque is added to the front of the deque.",
                "One common use case for the enqueue at front operation in deques is managing \ntasks or jobs in job scheduling systems, where new tasks are added to the front and \nprocessed in the order they were added."
            }
        };
        String[][]  dQDequeueRear = {
            {
                "What is the purpose of the dequeue at rear operation in a double-ended queue \n(deque)?",
                "Which of the following statements about the dequeue at rear operation in deques\n is true?",
                "What happens when you attempt to dequeue from the rear of an empty deque?",
                "In a deque implementation using arrays, what typically happens when the deque \nbecomes less than half full after a dequeue at rear operation?",
                "What is the time complexity of the dequeue at rear operation in a deque?",
                "Which data structure concept is most closely associated with the dequeue at rear\n operation in a deque?",
                "What is dequeued at the rear during a dequeue at rear operation in a deque?",
                "Which of the following is a common use case for the dequeue at rear operation in deques?"
            },
            {
                "To remove an element from the rear of the deque.",
                "Dequeue at rear operation can be performed on both empty and non-empty deques.",
                "The element is silently discarded.",
                "A new deque is created and the element is removed from it.",
                "O(n)",
                "FIFO (First In, First Out)",
                "An element from the bottom of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "To check if an element is in the deque.",
                "Dequeue at rear operation can only be performed on a non-empty deque.",
                "The element is removed from the deque and returned.",
                "An exception is thrown.",
                "O(1) amortized",
                "Binary search tree traversal order.",
                "An element that was previously enqueued into the deque.",
                "Maintaining history in web browsers."
            },
            {
                "To add an element to the front of the deque.",
                "Dequeue at rear operation can only be performed on an empty deque.",
                "A deque underflow error occurs.",
                "The deque is resized to accommodate fewer elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element from the middle of the deque.",
                "Undo operations in text editors."
            },
            {
                "To sort elements in the deque.",
                "Dequeue at rear operation cannot be performed on deques.",
                "The element is added, replacing the oldest element in the deque.",
                "The element is removed from the deque.",
                "O(log n)",
                "Linked list node insertion order.",
                "An element that was previously enqueued at the rear of the deque.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the rear of the deque.",
                "Dequeue at rear operation can only be performed on a non-empty deque.",
                "A deque underflow error occurs.",
                "The deque is resized to accommodate fewer elements.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "An element that was previously enqueued at the rear of the deque.",
                "Processing tasks in job scheduling."
            },
            {
                "The dequeue at rear operation in a double-ended queue (deque) removes the rear \n(end) element from the deque, allowing access to the most recently added element.",
                "Dequeue at rear operation can only be performed on a non-empty deque, as long as \nthere are elements to remove from the rear.",
                "Attempting to dequeue from the rear of an empty deque results in a deque underflow \nerror, indicating that there are no elements to remove.",
                "In a deque using arrays, when the deque becomes less than half full after a dequeue \nat rear operation, the size of the deque may be reduced or elements may be \nshifted to reclaim memory.",
                "The time complexity of the dequeue at rear operation in a deque is O(1), as it \ninvolves a constant-time operation of removing an element from the rear of the deque.",
                "The dequeue at rear operation in deques follows the LIFO (Last In, First Out) \nprinciple, where the last element added (enqueued) to the rear is the first one to be\n removed.",
                "During a dequeue at rear operation in a deque, the element that was most recently \nenqueued at the rear is removed and returned for further processing or use.",
                "One common use case for the dequeue at rear operation in deques is managing tasks or\n jobs in job scheduling systems, where the most recently added task is removed \nand processed next."
            }   
        };
        String[][] sLInsertTail = {
            {
            "What is the purpose of the insert at tail operation in a singly linked list?",
            "Which of the following is true about the insert at tail operation in a singly \nlinked list?",
            "What happens to the tail pointer in a singly linked list after an element is \ninserted at the tail?",
            "What is the time complexity of the insert at tail operation in a singly linked \nlist if the tail pointer is maintained?",
            "In a singly linked list without a tail pointer, what is the time complexity of \nthe insert at tail operation?",
            "When inserting an element at the tail of a singly linked list, what must be \nupdated?",
            "Which of the following best describes the final step in inserting a new node \nat the tail of a singly linked list?",
            "What should the 'next' pointer of the new tail node point to after insertion?"
            },
            {
            "To remove an element from the end of the list.",
            "The new element is added at the beginning of the list.",
            "It points to the second last element.",
            "O(1)",
            "O(1)",
            "The 'next' pointer of the new node.",
            "Setting the head pointer to the new node.",
            "The head node."
            },
            {
            "To add an element to the end of the list.",
            "The new element is added at the end of the list.",
            "It points to the new node.",
            "O(n)",
            "O(n)",
            "The 'next' pointer of the previous tail node.",
            "Setting the 'next' pointer of the new node to the current head.",
            "The previous tail node."
            },
            {
            "To add an element to the beginning of the list.",
            "The new element is added at the middle of the list.",
            "It remains unchanged.",
            "O(log n)",
            "O(log n)",
            "The 'next' pointer of the head node.",
            "Setting the 'next' pointer of the current tail to the new node.",
            "The new node itself."
            },
            {
            "To sort the elements in the list.",
            "The new element replaces the current head of the list.",
            "It points to the new head.",
            "O(n^2)",
            "O(n^2)",
            "The 'next' pointer of the last element.",
            "Setting the 'next' pointer of the new node to null.",
            "None of the nodes."
            },
            {
            "To add an element to the end of the list.",
            "The new element is added at the end of the list.",
            "It points to the new node.",
            "O(1)",
            "O(n)",
            "The 'next' pointer of the previous tail node.",
            "Setting the 'next' pointer of the current tail to the new node.",
            "None of the nodes."
            },
            {
            "The insert at tail operation in a singly linked list adds a new element to the \nend (tail) of the list, extending the list by one element.",
            "Inserting at the tail means adding a new element to the end of the list, updating\n the tail to this new element.",
            "After inserting a new element at the tail, the tail pointer should point to the \nnew node, making it the new end of the list.",
            "If the tail pointer is maintained, inserting at the tail is an O(1) operation \nbecause it involves updating a constant number of pointers.",
            "Without a tail pointer, finding the current tail to insert the new element takes \nO(n) time, as it requires traversing the entire list.",
            "When inserting at the tail, the 'next' pointer of the previous tail node must be \nupdated to point to the new node.",
            "The final step in inserting a new node at the tail is setting the 'next' pointer \nof the current tail to point to the new node, linking it to the end of the list.",
            "After insertion, the 'next' pointer of the new tail node should point to null, \nindicating that it is the last node in the list."
            }
        };
        String[][] sLDeleteTail = {
            {
                "What is the purpose of the delete at tail operation in a singly linked list?",
                "Which of the following is true about the delete at tail operation in a singly \nlinked list?",
                "What happens to the tail pointer in a singly linked list after the tail element \nis deleted?",
                "What is the time complexity of the delete at tail operation in a singly linked \nlist?",
                "In a singly linked list, what needs to be updated when the tail node is deleted?",
                "Which of the following best describes the process of deleting the tail node in a \nsingly linked list?",
                "What happens to the second-to-last node's 'next' pointer after deleting the tail \nnode in a singly linked list?",
                "What is a common challenge in implementing the delete at tail operation in a singly\n linked list?"
            },
            {
                "To add an element to the end of the list.",
                "The tail node remains unchanged.",
                "It points to the new tail node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the tail node's 'next' pointer to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To sort the elements in the list.",
                "The 'next' pointer of the tail node is always updated.",
                "It points to null.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Removing the head node.",
                "It remains unchanged.",
                "Finding the second-to-last node."
            },
            {
                "To remove an element from the end of the list.",
                "The head node is always updated.",
                "It points to the previous tail node.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the head node.",
                "It points to the new head node.",
                "Ensuring the list is not empty."
            },
            {
                "To check if an element is in the list.",
                "The previous node becomes the new tail node.",
                "It points to the head node.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the previous node to null.",
                "It points to the previous tail node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from the end of the list.",
                "The previous node becomes the new tail node.",
                "It points to null.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous node to null.",
                "It points to null.",
                "Finding the second-to-last node."
            },
            {
                "The delete at tail operation in a singly linked list removes the last (tail) \nelement from the list, reducing the list by one element.",
                "After the tail node is deleted, the previous node becomes the new tail node, as \nit is now the last element in the list.",
                "After deleting the tail element, the tail pointer should point to null, indicating\n that there is no next element.",
                "The time complexity of the delete at tail operation in a singly linked list is O(n)\n because it requires traversing the list to find the second-to-last element.",
                "When deleting the tail node, the 'next' pointer of the previous node (second-to-last\n node) must be updated to null, as it becomes the new tail.",
                "Deleting the tail node involves updating the 'next' pointer of the previous node to\n null, effectively removing the reference to the old tail node.",
                "After deleting the tail node, the 'next' pointer of the second-to-last node should \npoint to null, indicating it is now the last node in the list.",
                "A common challenge in implementing the delete at tail operation is finding the \nsecond-to-last node, which requires traversing the list from the head."
            }
        };
        String[][] sLInsertHead = {
            {
                "What is the purpose of the insert at head operation in a singly linked list?",
                "Which of the following is true about the insert at head operation in a singly \nlinked list?",
                "What happens to the head pointer in a singly linked list after an element is \ninserted at the head?",
                "What is the time complexity of the insert at head operation in a singly linked \nlist?",
                "In a singly linked list, what needs to be updated when a new node is inserted at \nthe head?",
                "Which of the following best describes the process of inserting a new node at the \nhead of a singly linked list?",
                "What happens to the new node's 'next' pointer when inserting it at the head of a \nsingly linked list?",
                "What should the 'next' pointer of the new head node point to after insertion?"
            },
            {
                "To remove an element from the beginning of the list.",
                "The new element is added at the end of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the new node.",
                "Setting the 'next' pointer of the new node to the current head.",
                "It points to null.",
                "The tail node."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "It points to the previous head node.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the head node.",
                "It points to the new head node.",
                "The previous head node."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at the middle of the list.",
                "It remains unchanged.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "The new node itself."
            },
            {
                "To sort the elements in the list.",
                "The new element replaces the current tail of the list.",
                "It points to the new head.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Removing the head node.",
                "It remains unchanged.",
                "None of the nodes."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the new node.",
                "Setting the 'next' pointer of the new node to the current head.",
                "It points to the previous head node.",
                "The previous head node."
            },
            {
                "The insert at head operation in a singly linked list adds a new element to the \nbeginning (head) of the list, making it the new first element.",
                "Inserting at the head means adding a new element to the beginning of the list, \nupdating the head to this new element.",
                "After inserting a new element at the head, the head pointer should point to the \nnew node, making it the new first element in the list.",
                "The time complexity of the insert at head operation in a singly linked list is O(1),\n as it involves updating only a constant number of pointers.",
                "When inserting at the head, the 'next' pointer of the new node must be updated to \npoint to the previous head node, ensuring the list remains connected.",
                "The process of inserting a new node at the head involves setting the 'next' pointer \nof the new node to point to the current head node, then updating the head \npointer to the new node.",
                "When inserting a new node at the head, its 'next' pointer should point to the previous \nhead node, linking the new node to the rest of the list.",
                "After insertion, the 'next' pointer of the new head node should point to the previous \nhead node, maintaining the correct order of elements in the list."
            }
        };
        String[][] sLDeleteHead = {
            {
                "What is the purpose of the delete at head operation in a singly linked list?",
                "Which of the following is true about the delete at head operation in a singly \nlinked list?",
                "What happens to the head pointer in a singly linked list after the head element \nis deleted?",
                "What is the time complexity of the delete at head operation in a singly linked \nlist?",
                "In a singly linked list, what needs to be updated when the head node is deleted?",
                "Which of the following best describes the process of deleting the head node in a \nsingly linked list?",
                "What happens to the second node's 'next' pointer after deleting the head node in a \nsingly linked list?",
                "What is a common challenge in implementing the delete at head operation in a singly \nlinked list?"
            },
            {
                "To add an element to the beginning of the list.",
                "The head node remains unchanged.",
                "It points to the tail node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new head node to null.",
                "It points to null.",
                "Finding the tail node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The head node is always updated.",
                "It points to the previous head node.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the new head node.",
                "Ensuring the list is not empty."
            },
            {
                "To check if an element is in the list.",
                "The next node becomes the new head node.",
                "It points to the new node.",
                "O(log n)",
                "The head pointer.",
                "Updating the head pointer to the next node.",
                "It remains unchanged.",
                "Ensuring the list is sorted."
            },
            {
                "To sort the elements in the list.",
                "The 'next' pointer of the tail node is always updated.",
                "It points to the new head node.",
                "O(n^2)",
                "The head pointer of the current node.",
                "Removing the tail node.",
                "It points to the previous node.",
                "Finding the second node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The next node becomes the new head node.",
                "It points to the new head node.",
                "O(1)",
                "The head pointer.",
                "Updating the head pointer to the next node.",
                "It remains unchanged.",
                "Ensuring the list is not empty."
            },
            {
                "The delete at head operation in a singly linked list removes the first (head) \nelement from the list, reducing the list by one element.",
                "After the head node is deleted, the next node becomes the new head node, as it \nis now the first element in the list.",
                "After deleting the head element, the head pointer should point to the new head \nnode, indicating the start of the list.",
                "The time complexity of the delete at head operation in a singly linked list is \nO(1) because it involves updating the head pointer.",
                "When deleting the head node, the head pointer must be updated to point to the next\n node, ensuring the list remains connected.",
                "The process of deleting the head node involves updating the head pointer to point \nto the next node, effectively removing the reference to the old head node.",
                "After deleting the head node, the second node's 'next' pointer doesn't effects \nanything, maintaining the correct order of elements in the list.",
                "A common challenge in implementing the delete at head operation is ensuring that \nthe list is not empty before attempting to delete the head node."
            }
        };
        String[][] sLInsertPosition = {
            {
                "What is the purpose of the insert at position operation in a singly linked list?",
                "Which of the following is true about the insert at position operation in a singly\n linked list?",
                "What happens to the pointers in a singly linked list when an element is inserted \nat a specific position?",
                "What is the time complexity of the insert at position operation in a singly linked \nlist?",
                "In a singly linked list, what needs to be updated when a new node is inserted at a \nspecific position?",
                "Which of the following best describes the process of inserting a new node at a \nspecific position in a singly linked list?",
                "What should the 'next' pointer of the new node point to after insertion at a \nspecific position in a singly linked list?",
                "What happens to the previous node's 'next' pointer when a new node is inserted \nat a specific position in a singly linked list?"
            },
            {
                "To remove an element from the list.",
                "The new element is added at the beginning of the list.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new node to null.",
                "It points to null.",
                "It remains unchanged."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at the end of the list.",
                "The previous node's 'next' pointer is updated.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the previous node.",
                "It points to the new node."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at a specific position in the list.",
                "The new node's 'next' pointer is updated.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the new head node.",
                "It remains null."
            },
            {
                "To sort the elements in the list.",
                "The new element replaces the current head of the list.",
                "Both the previous and new node's 'next' pointers are updated.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the next node.",
                "It points to the next node."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "Both the previous and new node's 'next' pointers are updated.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the next node.",
                "It points to the new node."
            },
            {
                "The insert at position operation in a singly linked list adds a new element at \na specific position in the list, ensuring it appears in the desired order.",
                "Inserting at a specific position means adding a new element at the designated \nindex in the list, shifting the subsequent elements.",
                "When inserting an element at a specific position, the 'next' pointer of the \nprevious node is updated to point to the new node, and the 'next' pointer of the \nnew node is updated to point to the subsequent node.",
                "The time complexity of the insert at position operation in a singly linked list \nis O(n) because it may require traversing the list to find the insertion point.",
                "When inserting at a specific position, the 'next' pointer of the previous node \n(before the insertion point) must be updated to point to the new node, ensuring \nthe list remains connected.",
                "The process of inserting a new node at a specific position involves updating the \n'next' pointer of the previous node to point to the new node, and setting the \n'next' pointer of the new node to point to the subsequent node.",
                "After insertion, the 'next' pointer of the new node should point to the node that \nwas originally at the insertion position, maintaining the correct order of \nelements.",
                "The 'next' pointer of the previous node is updated to point to the new node, \neffectively inserting the new node at the desired position in the list."
            }            
        }; 
        String[][] sLDeletePosition = {
            {
                "What is the purpose of the delete at position operation in a singly linked \nlist?",
                "Which of the following is true about the delete at position operation in a \nsingly linked list?",
                "What happens to the pointers in a singly linked list when an element is deleted\n from a specific position?",
                "What is the time complexity of the delete at position operation in a singly\n linked list?",
                "In a singly linked list, what needs to be updated when a node is deleted from\n a specific position?",
                "Which of the following best describes the process of deleting a node at a \nspecific position in a singly linked list?",
                "What happens to the previous node's 'next' pointer when a node is deleted \nfrom a specific position in a singly linked list?",
                "What is a common challenge in implementing the delete at position operation \nin a singly linked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new head node to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at the beginning of the list is deleted.",
                "The previous node's 'next' pointer is updated.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the new node.",
                "Ensuring the list is not empty."
            },
            {
                "To check if an element is in the list.",
                "The element at a specific position is deleted.",
                "The new node's 'next' pointer is updated.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "Ensuring the list is sorted."
            },
            {
                "To sort the elements in the list.",
                "The element at the middle of the list is deleted.",
                "Both the previous and new node's 'next' pointers are updated.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the next node.",
                "Finding the previous node."
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at a specific position is deleted.",
                "The previous node's 'next' pointer is updated.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the next node.",
                "Finding the previous node."
            },
            {
                "The delete at position operation in a singly linked list removes an element\n from a specific position in the list, reducing the list by one element.",
                "Deleting at a specific position means removing the element at the designated \nindex in the list, shifting the subsequent elements.",
                "When deleting an element from a specific position, the 'next' pointer of the \nprevious node is updated to point to the node after the deleted node, maintaining \nthe list structure.",
                "The time complexity of the delete at position operation in a singly linked list\n is O(n) because it may require traversing the list to find the node to be deleted.",
                "When deleting at a specific position, the 'next' pointer of the previous node \n(before the deletion point) must be updated to point to the node after the deleted node,\n ensuring the list remains connected.",
                "The process of deleting a node at a specific position involves updating the \n'next' pointer of the previous node to point to the node after the deleted node, effectively\n removing the node from the list.",
                "After deleting a node, the 'next' pointer of the previous node should point to\n the node that comes after the deleted node, maintaining the correct order of elements.",
                "A common challenge in implementing the delete at position operation is finding\n the previous node, which requires traversing the list from the head to the node just before\n the deletion point."
            }            
        };
        String[][]  cLInsertTail = {
            {
                "What is the purpose of the insert at tail operation in a circular linked list?",
                "Which of the following is true about the insert at tail operation in a circular\n linked list?",
                "What happens to the tail pointer in a circular linked list when an element is \ninserted at the tail?",
                "What is the time complexity of the insert at tail operation in a circular linked\n list?",
                "In a circular linked list, what needs to be updated when a new node is inserted at\n the tail?",
                "Which of the following best describes the process of inserting a new node at the\n tail of a circular linked list?",
                "What happens to the new node's 'next' pointer when inserting it at the tail of a\n circular linked list?",
                "What should the 'next' pointer of the current tail node point to after insertion\n at the tail?"
            },
            {
                "To remove an element from the end of the list.",
                "The new element is added at the beginning of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new node to null.",
                "It points to null.",
                "The new head node."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at the end of the list.",
                "It points to the previous tail node.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous tail node.",
                "It points to the head node.",
                "The previous tail node."
            },
            {
                "To add an element to the middle of the list.",
                "The new element is added at the middle of the list.",
                "It remains unchanged.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "The new node itself."
            },
            {
                "To sort the elements in the list.",
                "The new element replaces the current tail of the list.",
                "It points to the new tail.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The tail node."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at the end of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the head node.",
                "The new node itself."
            },
            {
                "The insert at tail operation in a circular linked list adds a new element to \nthe end of the list, maintaining the circular structure.",
                "Inserting at the tail means adding a new element to the end of the list, updating\n the tail to this new element.",
                "After inserting a new element at the tail, the tail pointer should point to the \nnew node, making it the new last element in the list.",
                "The time complexity of the insert at tail operation in a circular linked list is \nO(1), as it involves updating only a constant number of pointers.",
                "When inserting at the tail, the 'next' pointer of the tail node must be updated to \npoint to the new node, ensuring the circular structure of the list.",
                "The process of inserting a new node at the tail involves setting the 'next' pointer \nof the current tail to point to the new node, then updating the tail pointer \nto the new node.",
                "When inserting a new node at the tail, its 'next' pointer should point to the head \nnode, maintaining the circular structure of the list.",
                "After insertion, the 'next' pointer of the new tail node should point to the head \nnode, maintaining the circular nature of the list."
            }            
        };
        String[][]  cLDeleteTail = {
            {
                "What is the purpose of the delete at tail operation in a circular linked list?",
                "Which of the following is true about the delete at tail operation in a circular \nlinked list?",
                "What happens to the tail pointer in a circular linked list when an element is \ndeleted from the tail?",
                "What is the time complexity of the delete at tail operation in a circular linked \nlist?",
                "In a circular linked list, what needs to be updated when a node is deleted from the\n tail?",
                "Which of the following best describes the process of deleting a node from the tail \nof a circular linked list?",
                "What happens to the new tail node's 'next' pointer after deleting the previous tail \nnode in a circular linked list?",
                "What is a common challenge in implementing the delete at tail operation in a circular \nlinked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "It points to the head node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new head node to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "It points to the previous tail node.",
                "O(n)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous tail node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "It remains unchanged.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new tail node.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "Finding the node just before the tail."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new tail node.",
                "O(1)",
                "The 'next' pointer of the previous node.",
                "Updating the 'next' pointer of the previous tail node.",
                "It points to the head node.",
                "Finding the node just before the tail."
            },
            {
                "The delete at tail operation in a circular linked list removes the last element\n from the list, maintaining the circular structure.",
                "Deleting at the tail means removing the last element from the list, updating the\n tail to the previous node.",
                "After deleting an element from the tail, the tail pointer should point to the new\n last node in the list, maintaining the circular structure.",
                "The time complexity of the delete at tail operation in a circular linked list is \nO(1), as it involves updating only a constant number of pointers.",
                "When deleting from the tail, the 'next' pointer of the node just before the tail \n(previous tail) must be updated to point to the head node, ensuring the \ncircular structure is maintained.",
                "The process of deleting a node from the tail involves finding the node just before\n the current tail, updating its 'next' pointer to point to the head node,\n then updating the tail pointer.",
                "After deletion, the 'next' pointer of the new tail node (previously the node just \nbefore the deleted tail) should point to the head node, maintaining the \ncircular nature of the list.",
                "A common challenge in implementing the delete at tail operation is efficiently \nfinding the node just before the tail, especially in a circular structure."
            }            
        }; 
        String[][]  cLInsertHead = {
            {
                "What is the purpose of the insert at head operation in a circular linked \nlist?",
                "Which of the following is true about the insert at head operation in a circular \nlinked list?",
                "What happens to the head pointer in a circular linked list when an element is \ninserted at the head?",
                "What is the time complexity of the insert at head operation in a circular linked \nlist?",
                "In a circular linked list, what needs to be updated when a new node is inserted \nat the head?",
                "Which of the following best describes the process of inserting a new node at the \nhead of a circular linked list?",
                "What happens to the new node's 'next' pointer when inserting it at the head of a \ncircular linked list?",
                "What should the 'next' pointer of the current head node point to after insertion \nat the head?"
            },
            {
                "To remove an element from the end of the list.",
                "The new element is added at the beginning of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new node to null.",
                "It points to null.",
                "The new node."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the end of the list.",
                "It points to the previous head node.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the current head node.",
                "The previous head node."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element replaces the current head of the list.",
                "It remains unchanged.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "The head node itself."
            },
            {
                "To sort the elements in the list.",
                "The new element is added at the middle of the list.",
                "It points to the new head node.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The tail node."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "It points to the new node.",
                "O(1)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the current head node.",
                "The previous head node."
            },
            {
                "The insert at head operation in a circular linked list adds a new element to\n the beginning of the list, maintaining the circular structure.",
                "Inserting at the head means adding a new element as the new first element in \nthe list, with its 'next' pointer pointing to the previous head node.",
                "After inserting a new element at the head, the head pointer should point to \nthe new node, making it the new first element in the list.",
                "The time complexity of the insert at head operation in a circular linked list \nis O(1), as it involves updating only a constant number of pointers.",
                "When inserting at the head, the 'next' pointer of the tail node must be updated \nto point to the new head node, ensuring the circular structure of the \nlist.",
                "The process of inserting a new node at the head involves setting the 'next' \npointer of the new node to point to the current head node, then updating \nthe head pointer to the new node.",
                "When inserting a new node at the head, its 'next' pointer should point to the \ncurrent head node, maintaining the circular nature of the list.",
                "After insertion, the 'next' pointer of the current head node should point to the \nnew node, ensuring the circular structure of the list."
            }            
        };
        String[][]  cLDeleteHead = {
            {
                "What is the purpose of the delete at head operation in a circular linked \nlist?",
                "Which of the following is true about the delete at head operation in a \ncircular linked list?",
                "What happens to the head pointer in a circular linked list when an element\n is deleted from the head?",
                "What is the time complexity of the delete at head operation in a circular \nlinked list?",
                "In a circular linked list, what needs to be updated when a node is deleted \nfrom the head?",
                "Which of the following best describes the process of deleting a node from the\n head of a circular linked list?",
                "What happens to the new head node's 'next' pointer after deleting the previous\n head node in a circular linked list?",
                "What is a common challenge in implementing the delete at head operation in a \ncircular linked list?"
            },
            {
                "To add an element to the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new head node.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the head node to null.",
                "It remains unchanged.",
                "Finding the previous node to the head node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "It points to the previous head node.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "It remains unchanged.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the tail node.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The tail node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "It points to the new head node.",
                "O(1)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It remains unchanged.",
                "Finding the previous node to the head node."
            },
            {
                "The delete at head operation in a circular linked list removes the first element\n from the list, maintaining the circular structure.",
                "Deleting at the head means removing the first element from the list, updating the\n head to the next node.",
                "After deleting an element from the head, the head pointer should point to the new\n first node in the list, maintaining the circular structure.",
                "The time complexity of the delete at head operation in a circular linked list is\n O(1), as it involves updating only a constant number of pointers.",
                "When deleting from the head, the 'next' pointer of the tail node must be updated\n to point to the new head node, ensuring the circular structure of the list.",
                "The process of deleting a node from the head involves updating the 'next' pointer\n of the tail node to point to the new head node, then updating the head pointer.",
                "After deletion, the 'next' pointer of the new head node (previously the node just\n after the deleted head) should not change its previous value, maintaining the \ncircular nature of the list.",
                "A common challenge in implementing the delete at head operation is efficiently \nfinding the previous node to the head node, especially in a circular structure."
            }
        };
        String[][]  cLInsertPosition = {
            {
                "What is the purpose of the insert at position operation in a circular linked \nlist?",
                "Which of the following is true about the insert at position operation in a \ncircular linked list?",
                "What happens to the pointers in a circular linked list when an element is \ninserted at a specific position?",
                "What is the time complexity of the insert at position operation in a circular\n linked list?",
                "In a circular linked list, what needs to be updated when a new node is inserted\n at a specific position?",
                "Which of the following best describes the process of inserting a new node at a \nspecific position in a circular linked list?",
                "What happens to the new node's 'next' pointer when inserting it at a specific \nposition in a circular linked list?",
                "What should the 'next' pointer of the node just before the inserted position \npoint to after insertion?"
            },
            {
                "To remove an element from the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the new node to null.",
                "It points to null.",
                "The new node."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at the beginning of the list.",
                "The 'next' pointer of the previous node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the head node.",
                "The new node itself."
            },
            {
                "To check if an element is in the list.",
                "The new element is added at a specific position in the list.",
                "The new node's 'next' pointer is updated.",
                "O(log n)",
                "The 'next' pointer of the tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous node at that point before.",
                "The previous node at the inserted position."
            },
            {
                "To sort the elements in the list.",
                "The new element replaces the current head of the list.",
                "Both the previous and new node's 'next' pointers are updated.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The head node."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "Both the previous and new node's 'next' pointers are updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the previous node at that point before.",
                "The new node itself."
            },
            {
                "The insert at position operation in a circular linked list adds a new element\n at a specified position in the list, maintaining the circular structure.",
                "Inserting at a specific position means adding a new element at the designated\n index in the list, shifting subsequent elements.",
                "When inserting an element at a specific position, the 'next' pointer of the \nprevious node (before the insertion point) is updated to point to the new node,\n maintaining the list structure.",
                "The time complexity of the insert at position operation in a circular linked \nlist is O(n), as it may require traversing the list to find the insertion point.",
                "When inserting at a specific position, the 'next' pointer of the tail node must \nbe updated to point to the new node, ensuring the circular structure of the \nlist.",
                "The process of inserting a new node at a specific position involves finding the \nnode just before the insertion point, updating its 'next' pointer to point to \nthe new node, and updating the new node's 'next' pointer to point to the node \noriginally at the insertion point.",
                "After insertion, the 'next' pointer of the new node should point to the node \noriginally at the insertion point, maintaining the correct order of elements.",
                "The 'next' pointer of the node just before the inserted position point to after \ninsertion should point to the new node itself."
            }            
        };
        String[][]  cLDeletePosition = {
            {
                "What is the purpose of the delete at position operation in a circular linked\n list?",
                "Which of the following is true about the delete at position operation in a \ncircular linked list?",
                "What happens to the pointers in a circular linked list when an element is \ndeleted from a specific position?",
                "What is the time complexity of the delete at position operation in a circular\n linked list?",
                "In a circular linked list, what needs to be updated when a node is deleted from\n a specific position?",
                "Which of the following best describes the process of deleting a node from a \nspecific position in a circular linked list?",
                "What happens to the 'next' pointer of the node just before the deleted position\n after deletion?",
                "What is a common challenge in implementing the delete at position operation in a\n circular linked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'next' pointer of the head node to null.",
                "It points to null.",
                "Finding the node just previous to the deleted node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "The 'next' pointer of the previous node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous node is updated to point to the node after the deleted position.",
                "O(log n)",
                "The 'next' pointer of the previous node of deleted node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the node after the deleted node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at the end of the list is deleted.",
                "It points to the tail node.",
                "O(n^2)",
                "The 'next' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The tail node."
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous node is updated to point to the node after the deleted position.",
                "O(n)",
                "The 'next' pointer of the previous node of deleted node.",
                "Updating the 'next' pointer of the previous node.",
                "It points to the node after the deleted node.",
                "Finding the node just previous to the deleted node."
            },
            {
                "The delete at position operation in a circular linked list removes an element\n from a specific index in the list, maintaining the circular structure.",
                "Deleting from a specific position means removing the element at the designated\n index in the list, adjusting pointers accordingly.",
                "When deleting an element from a specific position, the 'next' pointer of the \nprevious node (before the deleted position) is updated to skip over the deleted \nnode, maintaining the list structure.",
                "The time complexity of the delete at position operation in a circular linked \nlist is O(n), as it may require traversing the list to find the deletion point.",
                "When deleting from a specific position, the 'next' pointer of the previous node\n of deleted must be updated to point to the node after the deleted node, ensuring\n the circular structure of the list.",
                "The process of deleting a node from a specific position involves finding the node\n just before the deletion point, updating its 'next' pointer to skip over the \nnode to be deleted, and then removing the node.",
                "After deletion, the 'next' pointer of the node just before the deleted position \nshould point to the node after the deleted node, maintaining the correct order of\n elements.",
                "A common challenge in implementing the delete at position operation is efficiently\n finding the previous node to the deletion point, especially in a circular \nstructure."
            }            
        };
        String[][]  dLInsertTail = {
            {
                "What is the purpose of the insert at tail operation in a doubly linked list?",
                "Which of the following is true about the insert at tail operation in a doubly\n linked list?",
                "What happens to the pointers in a doubly linked list when an element is inserted\n at the tail?",
                "What is the time complexity of the insert at tail operation in a doubly linked \nlist?",
                "In a doubly linked list, what needs to be updated when a new node is inserted at \nthe tail?",
                "Which of the following best describes the process of inserting a new node at the \ntail of a doubly linked list?",
                "What happens to the 'prev' pointer of the new tail node after insertion?",
                "What is a common challenge in implementing the insert at tail operation in a doubly\n linked list?"
            },
            {
                "To remove an element from the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'prev' pointer of the head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "The 'prev' pointer of the new node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "The 'prev' pointer of the previous tail node is updated to point to the new node.",
                "O(log n)",
                "The 'next' pointer of the current tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous tail node.",
                "Ensuring the list is sorted."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at the end of the list.",
                "The 'prev' pointer of the new node remains unchanged.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node.",
                "The tail node."
            },
            {
                "To add an element to the end of the list.",
                "The new element is added at the end of the list.",
                "The 'prev' pointer of the previous tail node is updated to point to the new node.",
                "O(1)",
                "The 'next' pointer of the current tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous tail node.",
                "Ensuring the list is not empty."
            },
            {
                "The insert at tail operation in a doubly linked list adds a new element at \nthe end of the list, maintaining both forward and backward links.",
                "Inserting at the tail means adding a new element as the new last element in \nthe list, with its 'prev' pointer pointing to the previous tail node.",
                "When inserting an element at the tail, the 'prev' pointer of the previous tail\n node must be updated to point to the new node, maintaining the list \nstructure.",
                "The time complexity of the insert at tail operation in a doubly linked list is\n O(1), as it involves updating only a constant number of pointers.",
                "When inserting at the tail, the 'next' pointer of the current tail node must be\n updated to point to the new node, ensuring the list remains connected.",
                "The process of inserting a new node at the tail involves setting the 'next' \npointer of the current tail node to the new node, then updating the new node's \n'prev' pointer to point back to the current tail node.",
                "After insertion, the 'prev' pointer of the new tail node should point to the \nprevious tail node, ensuring the correct order of elements in the list.",
                "A common challenge in implementing the insert at tail operation is handling \nspecial cases such as when the list is initially empty."
            }            
        };
        String[][]  dLDeleteTail = {
            {
                "What is the purpose of the delete at tail operation in a doubly linked list?",
                "Which of the following is true about the delete at tail operation in a \ndoubly linked list?",
                "What happens to the pointers in a doubly linked list when an element is \ndeleted from the tail?",
                "What is the time complexity of the delete at tail operation in a doubly \nlinked list?",
                "In a doubly linked list, what needs to be updated when a node is deleted \nfrom the tail?",
                "Which of the following best describes the process of deleting a node from \nthe tail of a doubly linked list?",
                "What happens to the 'next' pointer of the new tail node after deletion?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'prev' pointer of the head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "It points to null."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "The 'prev' pointer of the previous tail node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the head node."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous node of tail node is updated to null.",
                "O(log n)",
                "The 'prev' pointer of the current tail node.",
                "Setting the 'prev' pointer of the current tail to the new node.",
                "It points to the previous head node."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new tail node.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new head node."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "The 'next' pointer of the previous node of tail node is updated to null.",
                "O(1)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to null."
            },
            {
                "The delete at tail operation in a doubly linked list removes an element \nfrom the end of the list, maintaining both forward and backward links.",
                "Deleting from the tail means removing the last element in the list, adjusting\n pointers accordingly.",
                "When deleting an element from the tail, the 'next' pointer of the previous \nnode of tail node must be updated to point to null, indicating the end of the \nlist.",
                "The time complexity of the delete at tail operation in a doubly linked list \nis O(1), as it involves updating only a constant number of pointers.",
                "When deleting from the tail, the 'next' pointer of the current tail node must \nbe updated to null, ensuring the list remains connected.",
                "The process of deleting a node from the tail involves setting the 'next' pointer\n of the previous tail node to null",
                "After deletion, the 'next' pointer of the new tail node (previously the node just \nbefore the deleted tail) should point to null, indicating the end of the \nlist."
            }            
        };
        String[][]  dLInsertHead = {
            {
                "What is the purpose of the insert at head operation in a doubly linked list?",
                "Which of the following is true about the insert at head operation in a \ndoubly linked list?",
                "What happens to the pointers in a doubly linked list when an element is \ninserted at the head?",
                "What is the time complexity of the insert at head operation in a doubly \nlinked list?",
                "In a doubly linked list, what needs to be updated when a new node is inserted\n at the head?",
                "Which of the following best describes the process of inserting a new node at \nthe head of a doubly linked list?",
                "What happens to the 'prev' pointer of the new head node after insertion?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'prev' pointer of the previous head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "It points to null."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "The 'prev' pointer of the new node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the head node."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "The 'prev' pointer of the previous head node is updated to point to the new node.",
                "O(log n)",
                "The 'next' pointer of the current tail node.",
                "Setting the 'next' pointer of the current tail to the new node.",
                "It points to the previous head node."
            },
            {
                "To remove an element from the end of the list.",
                "The new element replaces the current head of the list.",
                "The 'prev' pointer of the new node remains unchanged.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating the 'prev' pointer of the previous head node.",
                "It points to the new head node."
            },
            {
                "To add an element to the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "The 'prev' pointer of the previous head node is updated to point to the new node.",
                "O(1)",
                "The 'prev' pointer of the previous head node.",
                "Updating the 'prev' pointer of the previous head node.",
                "It points to null."
            },
            {
                "The insert at head operation in a doubly linked list adds a new element at \nthe beginning of the list, maintaining both forward and backward links.",
                "Inserting at the head means adding a new element as the new first element in\n the list, with its 'prev' pointer pointing to null.",
                "When inserting an element at the head, the 'prev' pointer of the previous head\n node must be updated to point to the new node, maintaining the list structure.",
                "The time complexity of the insert at head operation in a doubly linked list is\n O(1), as it involves updating only a constant number of pointers.",
                "When inserting at the head, the 'prev' pointer of the previous head node must\n be updated to point to the new node, ensuring the list remains connected.",
                "The process of inserting a new node at the head involves setting the 'prev' \npointer of the previous head node to the new node, then updating the new node's \n'next' pointer to point to the previous head node.",
                "After insertion, the 'prev' pointer of the new head node should point to null, \nindicating the start of the list."
            }
        };
        String[][]  dLDeleteHead = {
            {
                "What is the purpose of the delete at head operation in a doubly linked list?",
                "Which of the following is true about the delete at head operation in a doubly\n linked list?",
                "What happens to the pointers in a doubly linked list when an element is deleted\n from the head?",
                "What is the time complexity of the delete at head operation in a doubly linked\n list?",
                "In a doubly linked list, what needs to be updated when a node is deleted from the\n head?",
                "Which of the following best describes the process of deleting a node from the head\n of a doubly linked list?",
                "What happens to the 'prev' pointer of the new head node after deletion?",
                "What is a common challenge in implementing the delete at head operation in a doubly\n linked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "The 'prev' pointer of the previous head node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the head node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous head node is updated to null.",
                "O(log n)",
                "The 'prev' pointer of the current tail node.",
                "Setting the 'prev' pointer of the current tail to the new node.",
                "It points to the previous head node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new head node.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating the head pointer.",
                "It points to the new tail node.",
                "The tail node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "The 'next' pointer of the previous head node is updated to null.",
                "O(1)",
                "The 'next' pointer of the head node.",
                "Updating the 'next' pointer of the head node.",
                "It points to null.",
                "Ensuring the list is not empty."
            },
            {
                "The delete at head operation in a doubly linked list removes an element \nfrom the beginning of the list, maintaining both forward and backward links.",
                "Deleting from the head means removing the first element in the list, \nadjusting pointers accordingly.",
                "When deleting an element from the head, the 'next' pointer of the previous\n head node must be updated to point to null, indicating the start of the list.",
                "The time complexity of the delete at head operation in a doubly linked list\n is O(1), as it involves updating only a constant number of pointers.",
                "When deleting from the head, the 'next' pointer of the head node must be \nupdated to null, ensuring the list remains connected.",
                "The process of deleting a node from the head involves setting the 'next' \npointer of the head node to null, then updating the head pointer to point to the \nnew first node.",
                "After deletion, the 'prev' pointer of the new head node (previously the node\n just after the deleted head) should point to null, indicating the start of the \nlist.",
                "A common challenge in implementing the delete at head operation is efficiently\n updating the head pointer and handling special cases such as when the list \nbecomes empty."
            }            
        };
        String[][]  dLInsertPosition = {
            {
                "What is the purpose of the insert at position operation in a doubly linked \nlist?",
                "Which of the following is true about the insert at position operation in a \ndoubly linked list?",
                "What happens to the pointers in a doubly linked list when an element is \ninserted at a specific position?",
                "What is the time complexity of the insert at position operation in a doubly \nlinked list?",
                "In a doubly linked list, what needs to be updated when a node is inserted at \na specific position?",
                "Which of the following best describes the process of inserting a new node at \na specific position in a doubly linked list?",
                "What happens to the 'prev' pointer of the new node after insertion at a \nspecific position?",
                "What is a common challenge in implementing the insert at position operation \nin a doubly linked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'prev' pointer of the head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "It points to null.",
                "Finding the head node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The new element is added at the beginning of the list.",
                "The 'prev' pointer of the new node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "It points to the head node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "The 'next' pointer of the previous node and the 'prev' pointer of the new node are updated.",
                "O(log n)",
                "The 'next' pointer of the previous node and the 'prev' pointer of the new node.",
                "Setting the 'prev' pointer of the current tail to the new node.",
                "It points to the previous node before the insertion position.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from the end of the list.",
                "The element at the end of the list is deleted.",
                "It points to the new head node.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating both the 'next' pointer of the previous node and the 'prev' pointer of the new node.",
                "It points to the new tail node.",
                "Finding the previous node to the insertion point"
            },
            {
                "To add an element to a specific position in the list.",
                "The new element is added at a specific position in the list.",
                "The 'next' pointer of the previous node and the 'prev' pointer of the new node are updated.",
                "O(n)",
                "The 'next' pointer of the previous node and the 'prev' pointer of the new node.",
                "Updating both the 'next' pointer of the previous node and the 'prev' pointer of the new node.",
                "It points to the previous node before the insertion position.",
                "Finding the previous node to the insertion point"
            },
            {
                "The insert at position operation in a doubly linked list adds a new element \nat a specified index in the list, maintaining both forward and backward links.",
                "Inserting at a specific position means adding a new element at the designated \nindex in the list, adjusting pointers accordingly.",
                "When inserting an element at a specific position, the 'next' pointer of the \nprevious node (before the insertion position) is updated to point to the new node,\n and the 'prev' pointer of the new node is updated to point back to the previous\n node, maintaining the list structure.",
                "The time complexity of the insert at position operation in a doubly linked list \nis O(n), as it may require traversing the list to find the insertion point.",
                "When inserting at a specific position, both the 'next' pointer of the previous \nnode and the 'prev' pointer of the new node must be updated to maintain the list's\n double-link structure.",
                "The process of inserting a new node at a specific position involves finding the \nnode just before the insertion point, updating its 'next' pointer to point to the \nnew node, and updating the new node's 'prev' pointer to point back to the \nprevious node.",
                "After insertion, the 'prev' pointer of the new node should point to the node just \nbefore the insertion position, ensuring the correct order of elements in the list.",
                "A common challenge in implementing the insert at position operation is efficiently \nfinding the previous node to the insertion point, especially in a doubly linked \nlist."
            }            
        };
        String[][]  dLDeletePosition = {
            {
                "What is the purpose of the delete at position operation in a doubly linked \nlist?",
                "Which of the following is true about the delete at position operation in a \ndoubly linked list?",
                "What happens to the pointers in a doubly linked list when an element is \ndeleted from a specific position?",
                "What is the time complexity of the delete at position operation in a doubly \nlinked list?",
                "In a doubly linked list, what needs to be updated when a node is deleted from \na specific position?",
                "Which of the following best describes the process of deleting a node from a \nspecific position in a doubly linked list?",
                "What is a common challenge in implementing the delete at position operation in\n a doubly linked list?"
            },
            {
                "To add an element to the list.",
                "The element at the end of the list is deleted.",
                "All pointers remain unchanged.",
                "O(1)",
                "The 'prev' pointer of the head node.",
                "Setting the 'prev' pointer of the head node to null.",
                "Finding the head node."
            },
            {
                "To remove an element from the beginning of the list.",
                "The element at the beginning of the list is deleted.",
                "The 'prev' pointer of the previous node is updated.",
                "O(n)",
                "The 'next' pointer of the tail node.",
                "Updating the 'next' pointer of the tail node.",
                "Ensuring the list is not empty."
            },
            {
                "To add an element to a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous node and the 'prev' pointer of the next node are updated.",
                "O(log n)",
                "The 'next' pointer of the previous node and the 'prev' pointer of the next node.",
                "Setting the 'prev' pointer of the current tail to the new node.",
                "Ensuring the list is sorted."
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at the end of the list is deleted.",
                "It points to the new head node.",
                "O(n^2)",
                "The 'prev' pointer of the current node.",
                "Updating both the 'next' pointer of the previous node and the 'prev' pointer of the next node.",
                "Finding both the previous and next nodes to the deletion point"
            },
            {
                "To remove an element from a specific position in the list.",
                "The element at a specific position is deleted.",
                "The 'next' pointer of the previous node and the 'prev' pointer of the next node are updated.",
                "O(n)",
                "The 'next' pointer of the previous node and the 'prev' pointer of the next node.",
                "Updating both the 'next' pointer of the previous node and the 'prev' pointer of the next node.",
                "Finding both the previous and next nodes to the deletion point"
            },
            {
                "The delete at position operation in a doubly linked list removes an element \nfrom a specified index in the list, maintaining both forward and backward \nlinks.",
                "Deleting from a specific position means removing the element at the designated\n index in the list, adjusting pointers accordingly.",
                "When deleting an element from a specific position, the 'next' pointer of the \nprevious node (before the deletion position) is updated to point to the \nnode after the deleted node, and the 'prev' pointer of the next node \n(after the deletion position) is updated to point back to the previous \nnode, maintaining the list structure.",
                "The time complexity of the delete at position operation in a doubly linked list\n is O(n), as it may require traversing the list to find the deletion \npoint.",
                "When deleting from a specific position, both the 'next' pointer of the previous \nnode (before the deletion position) and the 'prev' pointer of the next \nnode (after the deletion position) must be updated to maintain the \nlist's double-link structure.",
                "The process of deleting a node from a specific position involves finding the node\n at the deletion point, updating its 'next' pointer to point to the node\n after the deletion position, and updating the 'prev' pointer of \nthe node after the deletion position to point back to the node before the \ndeletion position.",
                "A common challenge in implementing the delete at position operation is efficiently\n finding both the previous and next nodes to the deletion point, \nespecially in a doubly linked list."
            }
        };
        String[][] inorder = {
            {
                "What is the purpose of inorder traversal in a binary tree?",
                "Which of the following statements about inorder traversal in binary search\n trees is true?",
                "What is the recursive order of traversal in inorder traversal?",
                "In a binary tree with n nodes, how many nodes are visited during an inorder\n traversal?",
                "What is the typical time complexity of inorder traversal in a binary tree?",
                "Which data structure concept is most closely associated with inorder traversal\n in a binary tree?",
                "Which of the following is a common use case for inorder traversal in binary trees?"
            },
            {
                "To visit nodes in level order.",
                "Inorder traversal always starts from the root node.",
                "Left subtree, root, right subtree.",
                "n nodes",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding the maximum element in the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Inorder traversal visits nodes in ascending order based on their values.",
                "Root, left subtree, right subtree.",
                "n-1 nodes",
                "O(n)",
                "FIFO (First In, First Out)",
                "Building an expression tree from postfix notation."
            },
            {
                "To sort nodes based on their level.",
                "Inorder traversal visits nodes in descending order based on their values.",
                "Left subtree, right subtree, root.",
                "2n nodes",
                "O(log n)",
                "Binary search tree traversal order.",
                "Counting the number of nodes in the binary tree."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Inorder traversal does not depend on the values of the nodes.",
                "Right subtree, root, left subtree.",
                "n+1 nodes",
                "O(n log n)",
                "Linked list node insertion order.",
                "Deleting nodes from the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Inorder traversal visits nodes in ascending order based on their values.",
                "Left subtree, root, right subtree.",
                "n nodes",
                "O(n)",
                "Binary search tree traversal order.",
                "Building an expression tree from postfix notation."
            },
            {
                "The purpose of inorder traversal in a binary tree is to visit nodes in \ndepth-first search order, specifically in ascending order based on \ntheir values.",
                "Inorder traversal visits nodes in ascending order based on their values, \nmaking it useful for tasks like retrieving data in sorted order.",
                "The recursive order of traversal in inorder is left subtree, root, right \nsubtree, ensuring that nodes are visited in the correct order.",
                "During an inorder traversal of a binary tree with n nodes, each node is \nvisited exactly once, resulting in n nodes being visited.",
                "The typical time complexity of inorder traversal in a binary tree is O(n), \nwhere n is the number of nodes, as each node must be visited once.",
                "Inorder traversal is closely associated with the concept of binary search \ntree traversal order, where nodes are visited in a specific sequence.",
                "A common use case for inorder traversal in binary trees is building an \nexpression tree from postfix notation, where operators and operands are \nplaced correctly based on their precedence."
            }            
        };
        String[][] preorder = {
            {
                "What is the purpose of preorder traversal in a binary tree?",
                "Which of the following statements about preorder traversal in binary \ntrees is true?",
                "What is the recursive order of traversal in preorder traversal?",
                "In a binary tree with n nodes, how many nodes are visited during a \npreorder traversal?",
                "What is the typical time complexity of preorder traversal in a binary \ntree?",
                "Which data structure concept is most closely associated with preorder \ntraversal in a binary tree?",
                "Which of the following is a common use case for preorder traversal in \nbinary trees?"
            },
            {
                "To visit nodes in level order.",
                "Preorder traversal always starts from the root node.",
                "Left subtree, root, right subtree.",
                "n nodes",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding the maximum element in the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Preorder traversal visits nodes in ascending order based on their values.",
                "Root, left subtree, right subtree.",
                "n-1 nodes",
                "O(n)",
                "FIFO (First In, First Out)",
                "Building an expression tree from postfix notation."
            },
            {
                "To sort nodes based on their level.",
                "Preorder traversal visits nodes in descending order based on their values.",
                "Left subtree, right subtree, root.",
                "2n nodes",
                "O(log n)",
                "Binary search tree traversal order.",
                "Counting the number of nodes in the binary tree."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Preorder traversal does not depend on the values of the nodes.",
                "Right subtree, root, left subtree.",
                "n+1 nodes",
                "O(n log n)",
                "Linked list node insertion order.",
                "Deleting nodes from the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Preorder traversal does not depend on the values of the nodes.",
                "Root, left subtree, right subtree.",
                "n nodes",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Building an expression tree from postfix notation."
            },
            {
                "The purpose of preorder traversal in a binary tree is to visit nodes in \ndepth-first search order, starting from the root node.",
                "Preorder traversal does not depend on the values of the nodes but follows \na specific order of visiting nodes.",
                "The recursive order of traversal in preorder is root, left subtree, right \nsubtree, ensuring that nodes are visited in the correct order.",
                "During a preorder traversal of a binary tree with n nodes, each node is \nvisited exactly once, resulting in n nodes being visited.",
                "The typical time complexity of preorder traversal in a binary tree is O(n),\n where n is the number of nodes, as each node must be visited once.",
                "Preorder traversal is closely associated with the concept of depth-first \nsearch (DFS) order, where nodes are visited in a specific sequence.",
                "A common use case for preorder traversal in binary trees is building an \nexpression tree from postfix notation, where operators and operands are \nplaced correctly based on their precedence."
            }
        };
        String[][] postorder = {
            {
                "What is the purpose of postorder traversal in a binary tree?",
                "Which of the following statements about postorder traversal in \nbinary trees is true?",
                "What is the recursive order of traversal in postorder traversal?",
                "In a binary tree with n nodes, how many nodes are visited during a \npostorder traversal?",
                "What is the typical time complexity of postorder traversal in a binary\n tree?",
                "Which data structure concept is most closely associated with postorder \ntraversal in a binary tree?",
                "Which of the following is a common use case for postorder traversal in \nbinary trees?"
            },
            {
                "To visit nodes in level order.",
                "Postorder traversal always starts from the root node.",
                "Left subtree, root, right subtree.",
                "n nodes",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding the maximum element in the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Postorder traversal visits nodes in ascending order based on their values.",
                "Root, left subtree, right subtree.",
                "n-1 nodes",
                "O(n)",
                "FIFO (First In, First Out)",
                "Building an expression tree from postfix notation."
            },
            {
                "To sort nodes based on their level.",
                "Postorder traversal visits nodes in descending order based on their values.",
                "Left subtree, right subtree, root.",
                "2n nodes",
                "O(log n)",
                "Binary search tree traversal order.",
                "Counting the number of nodes in the binary tree."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Postorder traversal does not depend on the values of the nodes.",
                "Right subtree, root, left subtree.",
                "n+1 nodes",
                "O(n log n)",
                "Linked list node insertion order.",
                "Deleting nodes from the binary tree."
            },
            {
                "To visit nodes in depth-first search order.",
                "Postorder traversal does not depend on the values of the nodes.",
                "Left subtree, right subtree, root.",
                "n nodes",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Deleting nodes from the binary tree."
            },
            {
                "The purpose of postorder traversal in a binary tree is to visit nodes in \ndepth-first search order, specifically processing child nodes before \nthe parent node.",
                "Postorder traversal does not depend on the values of the nodes but follows\na specific order of visiting nodes.",
                "The recursive order of traversal in postorder is left subtree, right subtree,\n root, ensuring that nodes are visited in the correct order.",
                "During a postorder traversal of a binary tree with n nodes, each node is \nvisited exactly once, resulting in n nodes being visited.",
                "The typical time complexity of postorder traversal in a binary tree is O(n), \nwhere n is the number of nodes, as each node must be visited once.",
                "Postorder traversal is closely associated with the concept of depth-first \nsearch (DFS) order, where nodes are visited in a specific sequence.",
                "A common use case for postorder traversal in binary trees is deleting nodes \nfrom the binary tree, ensuring that child nodes are processed before \ntheir parent."
            }
        };
        String[][] bSTInsert = {
            {
                "What is the purpose of the insert operation in a binary search tree (BST)?",
                "Which of the following statements about the insert operation in BSTs is true?",
                "What is the typical time complexity of the insert operation in a BST?",
                "What happens if you attempt to insert a value that already exists in the BST?",
                "Which data structure concept is most closely associated with the insert \noperation in a BST?",
                "Which of the following is a common use case for the insert operation in BSTs?"
            },
            {
                "To find the maximum element in the BST.",
                "Insert operation can only be performed on an empty BST.",
                "O(1)",
                "The value is ignored and not inserted.",
                "FIFO (First In, First Out)",
                "Finding an element in the BST."
            },
            {
                "To remove an element from the BST.",
                "Insert operation can be performed on both empty and non-empty BSTs.",
                "O(n)",
                "The existing value is updated with the new value.",
                "LIFO (Last In, First Out)",
                "Sorting elements in the BST."
            },
            {
                "To insert an element in sorted order.",
                "Insert operation can only be performed on a non-empty BST.",
                "O(log n)",
                "The BST becomes unbalanced.",
                "Binary search tree traversal order.",
                "Maintaining a dictionary or associative array."
            },
            {
                "To check if an element is in the BST.",
                "Insert operation cannot be performed on BSTs.",
                "O(n log n)",
                "The value is inserted at the correct position.",
                "Linked list node insertion order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To insert an element in sorted order.",
                "Insert operation can be performed on both empty and non-empty BSTs.",
                "O(log n)",
                "The existing value is updated with the new value.",
                "Binary search tree traversal order.",
                "Maintaining a dictionary or associative array."
            },
            {
                "The purpose of the insert operation in a binary search tree (BST) is to \nmaintain the order of elements so that they are inserted in a sorted manner\n based on their values.",
                "Insert operation can be performed on both empty and non-empty BSTs, \nallowing elements to be added or updated based on their presence in the tree.",
                "The typical time complexity of the insert operation in a BST is O(log n),\n where n is the number of nodes, as it involves traversing the height of \nthe tree.",
                "If you attempt to insert a value that already exists in the BST, the \nexisting value is typically updated with the new value, ensuring no duplicates.",
                "The insert operation in a BST is closely associated with the concept of \nbinary search tree traversal order, where nodes are inserted based on their\nvalue order.",
                "A common use case for the insert operation in BSTs is maintaining a dictionary\n or associative array, where keys are inserted in sorted order for \nefficient lookup and retrieval."
            }
        };
        String[][]  bSTDelete = {
            {
                "What is the purpose of the delete operation in a binary search tree (BST)?",
                "Which of the following statements about the delete operation in BSTs is true?",
                "What is the typical time complexity of the delete operation in a BST?",
                "What happens if you attempt to delete a value that does not exist in the BST?",
                "Which data structure concept is most closely associated with the delete \noperation in a BST?",
                "Which of the following is a common use case for the delete operation in \nBSTs?"
            },
            {
                "To find the maximum element in the BST.",
                "Delete operation can only be performed on an empty BST.",
                "O(1)",
                "The BST becomes unbalanced.",
                "FIFO (First In, First Out)",
                "Finding an element in the BST."
            },
            {
                "To remove an element from the BST.",
                "Delete operation can be performed on both empty and non-empty BSTs.",
                "O(n)",
                "The delete operation has no effect.",
                "LIFO (Last In, First Out)",
                "Sorting elements in the BST."
            },
            {
                "To insert an element in sorted order.",
                "Delete operation can only be performed on a non-empty BST.",
                "O(log n)",
                "The BST remains unchanged.",
                "Binary search tree traversal order.",
                "Maintaining a dictionary or associative array."
            },
            {
                "To check if an element is in the BST.",
                "Delete operation cannot be performed on BSTs.",
                "O(n log n)",
                "The value is deleted from the BST.",
                "Linked list node insertion order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To remove an element from the BST.",
                "Delete operation can be performed on both empty and non-empty BSTs.",
                "O(log n)",
                "The delete operation has no effect.",
                "Binary search tree traversal order.",
                "Maintaining a dictionary or associative array."
            },
            {
                "The purpose of the delete operation in a binary search tree (BST) is to remove\n an element while maintaining the BST properties.",
                "Delete operation can be performed on both empty and non-empty BSTs, allowing \nelements to be removed or adjusted based on their presence in the tree.",
                "The typical time complexity of the delete operation in a BST is O(log n), where\n n is the number of nodes, as it involves traversing the height of the tree.",
                "If you attempt to delete a value that does not exist in the BST, the delete \noperation typically has no effect, leaving the tree unchanged.",
                "The delete operation in a BST is closely associated with the concept of binary\n search tree traversal order, where nodes are adjusted or removed based on their value order.",
                "A common use case for the delete operation in BSTs is maintaining a dictionary \nor associative array, where keys are removed or adjusted to maintain the ordered structure of the tree."
            }
        };
        String[][] bSTSearch = {
            {
                "What is the purpose of the search operation in a binary search tree (BST)?",
                "Which of the following statements about the search operation in BSTs is true?",
                "What is the typical time complexity of the search operation in a BST?",
                "What happens if you attempt to search for a value that does not exist in the BST?",
                "Which data structure concept is most closely associated with the search operation \nin a BST?",
                "Which of the following is a common use case for the search operation in BSTs?"
            },
            {
                "To find the maximum element in the BST.",
                "Search operation can only be performed on an empty BST.",
                "O(1)",
                "The search operation fails and returns NULL.",
                "FIFO (First In, First Out)",
                "Finding an element in the BST."
            },
            {
                "To remove an element from the BST.",
                "Search operation can be performed on both empty and non-empty BSTs.",
                "O(n)",
                "The search operation has no effect.",
                "LIFO (Last In, First Out)",
                "Sorting elements in the BST."
            },
            {
                "To insert an element in sorted order.",
                "Search operation can only be performed on a non-empty BST.",
                "O(log n)",
                "The BST remains unchanged.",
                "Binary search tree traversal order.",
                "Maintaining a dictionary or associative array."
            },
            {
                "To check if an element is in the BST.",
                "Search operation cannot be performed on BSTs.",
                "O(n log n)",
                "The value is found and returned.",
                "Linked list node insertion order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To check if an element is in the BST.",
                "Search operation can be performed on both empty and non-empty BSTs.",
                "O(log n)",
                "The search operation fails and returns NULL.",
                "Binary search tree traversal order.",
                "Finding an element in the BST."
            },
            {
                "The purpose of the search operation in a binary search tree (BST) is to find\n whether a specific element exists in the tree.",
                "Search operation can be performed on both empty and non-empty BSTs, allowing\n elements to be checked for their presence in the tree.",
                "The typical time complexity of the search operation in a BST is O(log n), \nwhere n is the number of nodes, as it leverages the properties of the BST \nfor efficient searching.",
                "If you attempt to search for a value that does not exist in the BST, the \nsearch operation typically fails and returns NULL or an indication of absence.",
                "The search operation in a BST is closely associated with the concept of binary\n search tree traversal order, where nodes are searched based on their \nvalue order.",
                "A common use case for the search operation in BSTs is finding a specific element\n in the tree for retrieval or validation purposes."
            }
        };
        String[][] bFS = {
            {
                "What is the purpose of breadth-first search (BFS) traversal in a graph?",
                "Which of the following statements about BFS traversal in graphs is true?",
                "What is the order of traversal in BFS?",
                "In a graph with n vertices and m edges, what is the typical time complexity\n of BFS?",
                "Which data structure concept is most closely associated with BFS traversal?",
                "Which of the following is a common use case for BFS traversal in graphs?"
            },
            {
                "To find the maximum element in the graph.",
                "BFS traversal can only start from the first vertex.",
                "Depth-first order.",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "BFS traversal explores all neighbors of a vertex before moving on to the next vertex.",
                "Breadth-first order.",
                "O(n + m)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To sort nodes based on their level.",
                "BFS traversal always finds the shortest path between two vertices.",
                "Random order.",
                "O(log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To check if a node is in the graph.",
                "BFS traversal depends on the values assigned to nodes in the graph.",
                "Topological order.",
                "O(n log n)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "BFS traversal explores all neighbors of a vertex before moving on to the next vertex.",
                "Breadth-first order.",
                "O(n + m)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "The purpose of breadth-first search (BFS) traversal in a graph is to \nsystematically visit all nodes level by level, exploring all neighbors of \na vertex before moving on to the next vertex.",
                "BFS traversal explores all neighbors of a vertex before moving on to the\n next vertex, ensuring all reachable nodes are visited in a breadth-first\n manner.",
                "The order of traversal in BFS is breadth-first, where all nodes at the\n current depth (level) are visited before moving on to nodes at the next\n depth.",
                "In a graph with n vertices and m edges, the typical time complexity of\n BFS is O(n + m), where n is the number of vertices and m is the number of\n edges, as each vertex and edge is processed once.",
                "BFS traversal is closely associated with the concept of FIFO (First In,\n First Out) order, where nodes are visited in the order they are added to\n the queue.",
                "A common use case for BFS traversal in graphs is finding the shortest path\n between two nodes, leveraging its ability to explore all neighbors level\n by level."
            }            
        };
        String[][] dFS = {
            {
                "What is the purpose of depth-first search (DFS) traversal in a graph?",
                "Which of the following statements about DFS traversal in graphs is true?",
                "What is the order of traversal in DFS?",
                "In a graph with n vertices and m edges, what is the typical time complexity\n of DFS?",
                "Which data structure concept is most closely associated with DFS traversal?",
                "Which of the following is a common use case for DFS traversal in graphs?"
            },
            {
                "To find the maximum element in the graph.",
                "DFS traversal explores all neighbors of a vertex before moving on to the next vertex.",
                "Breadth-first order.",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in depth-first search order.",
                "DFS traversal can only start from the first vertex.",
                "Depth-first order.",
                "O(n + m)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To find a cycle or path in the graph.",
                "DFS traversal always finds the shortest path between two vertices.",
                "Random order.",
                "O(log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To check if a node is in the graph.",
                "DFS traversal depends on the values assigned to nodes in the graph.",
                "Topological order.",
                "O(n log n)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find a cycle or path in the graph.",
                "DFS traversal explores all neighbors of a vertex before moving on to the next vertex.",
                "Depth-first order.",
                "O(n + m)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "The purpose of depth-first search (DFS) traversal in a graph is to \nsystematically explore all vertices and edges, potentially finding cycles \nor paths within the graph.",
                "DFS traversal explores all neighbors of a vertex before moving on to\n the next vertex, which can lead to deeper exploration of paths and cycles.",
                "The order of traversal in DFS is depth-first, where the traversal goes\n as deep as possible along each branch before backtracking.",
                "In a graph with n vertices and m edges, the typical time complexity of\n DFS is O(n + m), where n is the number of vertices and m is the number\n of edges, as each vertex and edge is processed once.",
                "DFS traversal is closely associated with the concept of LIFO (Last In,\n First Out) order, where nodes are visited in the order they are added \nto the stack.",
                "A common use case for DFS traversal in graphs is finding a cycle or path,\n leveraging its ability to explore deeply into the graph structure."
            }
        };
        String[][] prims = {
            {
                "What is the purpose of Prim's algorithm in graph theory?",
                "Which of the following statements about Prim's algorithm is true?",
                "What is the primary goal of Prim's algorithm?",
                "In a graph with n vertices and m edges, what is the typical time \ncomplexity of Prim's algorithm?",
                "Which data structure concept is most closely associated with Prim's\n algorithm?",
                "Which of the following is a common use case for Prim's algorithm?"
            },
            {
                "To find the maximum element in the graph.",
                "Prim's algorithm guarantees finding the shortest path between two vertices.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Prim's algorithm can only start from the first vertex.",
                "To sort nodes based on their level.",
                "O(n)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To check if a node is in the graph.",
                "Prim's algorithm always results in a Hamiltonian path.",
                "To find the maximum spanning tree (MST) of the graph.",
                "O(n log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To find the minimum spanning tree (MST) of the graph.",
                "Prim's algorithm depends on the values assigned to nodes in the graph.",
                "To remove an element from the MST.",
                "O(n^2)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find the minimum spanning tree (MST) of the graph.",
                "Prim's algorithm guarantees finding the shortest path between two vertices.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(n^2)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "The purpose of Prim's algorithm in graph theory is to find the minimum \nspanning tree (MST) of a connected, weighted graph, where the sum of the \nweights of the edges in the tree is minimized.",
                "Prim's algorithm guarantees finding the minimum spanning tree (MST) of \nthe graph by always selecting the shortest edge that connects a vertex in \nthe MST to a vertex not yet in the MST.",
                "The primary goal of Prim's algorithm is to construct the minimum spanning\n tree (MST) of the graph, ensuring all vertices are connected with the \nminimum possible total edge weight.",
                "In a graph with n vertices and m edges, the typical time complexity of \nPrim's algorithm is O(n^2) using an adjacency matrix representation, or \nO(m log n) using a priority queue with adjacency list representation.",
                "Prim's algorithm is closely associated with the concept of FIFO (First \nIn, First Out) order, particularly when using a priority queue to manage \nthe selection of edges.",
                "A common use case for Prim's algorithm is finding the shortest path or \nminimum cost path between two nodes in a graph, leveraging its ability to \nbuild the minimum spanning tree (MST)."
            }
        };
        String[][] kruskals = {
            {
                "What is the purpose of Kruskal's algorithm in graph theory?",
                "Which of the following statements about Kruskal's algorithm is true?",
                "What is the primary goal of Kruskal's algorithm?",
                "In a graph with n vertices and m edges, what is the typical time \ncomplexity of Kruskal's algorithm using a union-find data structure?",
                "Which data structure concept is most closely associated with Kruskal's\n algorithm?",
                "Which of the following is a common use case for Kruskal's algorithm?"
            },
            {
                "To find the maximum element in the graph.",
                "Kruskal's algorithm always results in a Hamiltonian path.",
                "To find the maximum spanning tree (MST) of the graph.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Kruskal's algorithm can only start from the first vertex.",
                "To sort nodes based on their level.",
                "O(n)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To check if a node is in the graph.",
                "Kruskal's algorithm guarantees finding the minimum spanning tree (MST) of the graph.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(n log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To find the minimum spanning tree (MST) of the graph.",
                "Kruskal's algorithm depends on the values assigned to nodes in the graph.",
                "To remove an element from the MST.",
                "O(m log n)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find the minimum spanning tree (MST) of the graph.",
                "Kruskal's algorithm guarantees finding the minimum spanning tree (MST) of the graph.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(m log n)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "The purpose of Kruskal's algorithm in graph theory is to find the minimum \nspanning tree (MST) of a connected, weighted graph, where the sum of the \nweights of the edges in the tree is minimized.",
                "Kruskal's algorithm guarantees finding the minimum spanning tree (MST) of \nthe graph by iteratively adding the smallest edge that does not form a \ncycle until all vertices are connected.",
                "The primary goal of Kruskal's algorithm is to construct the minimum spanning\n tree (MST) of the graph, ensuring all vertices are connected with the \nminimum possible total edge weight.",
                "In a graph with n vertices and m edges, the typical time complexity of \nKruskal's algorithm using a union-find data structure is O(m log n), where m \nis the number of edges and n is the number of vertices.",
                "Kruskal's algorithm is closely associated with the concept of FIFO (First \nIn, First Out) order, particularly when sorting edges by weight and adding \nthem to the MST.",
                "A common use case for Kruskal's algorithm is finding the shortest path or \nminimum cost path between two nodes in a graph, leveraging its ability to \nbuild the minimum spanning tree (MST)."
            }
        };
        String[][] dijkstras = {
            {
                "What is the purpose of Dijkstra's algorithm in graph theory?",
                "Which of the following statements about Dijkstra's algorithm\n is true?",
                "What is the primary goal of Dijkstra's algorithm?",
                "In a graph with n vertices and m edges, what is the typical \ntime complexity of Dijkstra's algorithm using a priority queue?",
                "Which data structure concept is most closely associated with\n Dijkstra's algorithm?",
                "Which of the following is a common use case for Dijkstra's \nalgorithm?"
            },
            {
                "To find the maximum element in the graph.",
                "Dijkstra's algorithm always results in a Hamiltonian path.",
                "To find the shortest path between nodes in a weighted graph.",
                "O(1)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Dijkstra's algorithm can only start from the first vertex.",
                "To sort nodes based on their level.",
                "O(n)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To check if a node is in the graph.",
                "Dijkstra's algorithm guarantees finding the shortest path between two vertices.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(n log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To find the shortest path between nodes in a weighted graph.",
                "Dijkstra's algorithm depends on the values assigned to nodes in the graph.",
                "To remove an element from the MST.",
                "O(m log n)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find the shortest path between nodes in a weighted graph.",
                "Dijkstra's algorithm guarantees finding the shortest path between two vertices.",
                "To find the shortest path between nodes in a weighted graph.",
                "O(n log n)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "The purpose of Dijkstra's algorithm in graph theory is to find the shortest \npath between a source vertex and all other vertices in a weighted graph.",
                "Dijkstra's algorithm guarantees finding the shortest path between two vertices\n by iteratively selecting the vertex with the smallest known distance \nuntil all vertices are processed.",
                "The primary goal of Dijkstra's algorithm is to compute the shortest path from a\n single source vertex to all other vertices in a weighted graph, \nminimizing the total path weight.",
                "In a graph with n vertices and m edges, the typical time complexity of Dijkstra's\n algorithm using a priority queue is O(n log n), where n is the \nnumber of vertices and m is the number of edges.",
                "Dijkstra's algorithm is closely associated with the concept of FIFO (First In,\n First Out) order when using a priority queue to manage vertices based\n on their shortest path estimates.",
                "A common use case for Dijkstra's algorithm is finding the shortest route or path\n between two locations in a map, leveraging its ability to compute \nshortest paths efficiently in weighted graphs."
            }
        };
        String[][] warshalls = {
            {
                "What is the purpose of Warshall's algorithm in graph theory?",
                "Which of the following statements about Warshall's algorithm is true?",
                "What is the primary goal of Warshall's algorithm?",
                "In a graph with n vertices, what is the typical time complexity of \nWarshall's algorithm?",
                "Which data structure concept is most closely associated with Warshall's\n algorithm?",
                "Which of the following is a common use case for Warshall's algorithm?"
            },
            {
                "To find the maximum element in the graph.",
                "Warshall's algorithm always results in a Hamiltonian path.",
                "To find the maximum spanning tree (MST) of the graph.",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Warshall's algorithm can only start from the first vertex.",
                "To find the transitive closure of a graph.",
                "O(n^2)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To check if a node is in the graph.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(n log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To find the transitive closure of a graph.",
                "Warshall's algorithm depends on the values assigned to nodes in the graph.",
                "To remove an element from the MST.",
                "O(n^3)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find the transitive closure of a graph.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph.",
                "To find the transitive closure of a graph.",
                "O(n^3)",
                "FIFO (First In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "The purpose of Warshall's algorithm in graph theory is to compute the transitive \nclosure of a directed graph, determining which vertices are reachable from \nothers.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph by\n iteratively updating a matrix to reflect the direct and transitive reachability \nbetween vertices.",
                "The primary goal of Warshall's algorithm is to compute the transitive closure \nof a graph, which is essential in various graph-related operations and algorithms.",
                "In a graph with n vertices, the typical time complexity of Warshall's algorithm \nis O(n^3), as it involves a triple nested loop to update the reachability matrix.",
                "Warshall's algorithm is closely associated with the concept of FIFO (First In, \nFirst Out) order when updating the reachability matrix in a systematic manner.",
                "A common use case for Warshall's algorithm is determining the transitive closure \nof a graph to understand reachability relationships between vertices, crucial in\n algorithms involving connectivity and paths."
            }
        };
        String[][][] mCQData = {
            linearSearch,binarySearch,
            selectionSort,insertionSort,bubbleSort,mergeSort,quickSort,radixSort,
            push,pop,
            gQEnqueue,gQDequeue,
            cQEnqueue,cQDequeue,
            dQEnqueueRear,dQDequeueFront,dQEnqueueFront,dQDequeueRear,
            sLInsertTail,sLDeleteTail,sLInsertHead,sLDeleteHead,sLInsertPosition,sLDeletePosition,
            cLInsertTail,cLDeleteTail,cLInsertHead,cLDeleteHead,cLInsertPosition,cLDeletePosition,
            dLInsertTail,dLDeleteTail,dLInsertHead,dLDeleteHead,dLInsertPosition,dLDeletePosition,
            inorder,preorder,postorder,
            bSTInsert,bSTDelete,bSTSearch,
            bFS,dFS,
            prims,kruskals,dijkstras,warshalls
        };
        System.out.println(tableNames.length + " " + mCQData.length);
        //int cnt = 0;
        // for (int k = 0; k < 48; k++)
        // {
        //     System.out.println(tableNames[k] + "\n");

        //     for (int i = 0; i < mCQData[k][0].length;i++)
        //     {
        //         System.out.println();
        //         if(mCQData[k][5][i].equals(mCQData[k][1][i]) || 
        //             mCQData[k][5][i].equals(mCQData[k][2][i]) || 
        //             mCQData[k][5][i].equals(mCQData[k][3][i]) || 
        //             mCQData[k][5][i].equals(mCQData[k][4][i]))
        //             {
        //                 System.out.println("Question " + (i+1) + "  " + true);
        //             }
        //         else
        //         {
        //             System.out.println("Question " + (i+1) + "  " + false);
        //             cnt++;
        //         }
        //     }
        // }

        // System.out.println(cnt);

        // String s ="The process of inserting a new node at a specific position involves finding the node just before the insertion point, updating its 'next' pointer to point to the new node, and updating the new node's 'next' pointer to point to the node originally at the insertion point.";
        // System.out.println(s.length());

        try{
            String url = "jdbc:mysql://localhost:3306/DataStructuresQuiz";
            String user = "root";
            String pass = "*****";
            Connection con = DriverManager.getConnection(url,user, pass);
            if(con != null)   System.out.println("Connection Successful");
            Statement st = con.createStatement();
            
            for (int k = 0; k < 48; k++)
            {
                    // String statement = "DROP table " + tableNames[k];
                    // st.execute(statement);     
                String statement = "Create table " + tableNames[k] + "(Sno INTEGER PRIMARY KEY, Question VARCHAR(400), OptionA VARCHAR(400), OptionB VARCHAR(400),OptionC VARCHAR(400),OptionD VARCHAR(400),CorrectAnswer VARCHAR(400),Explanation VARCHAR(400))";
                st.execute(statement);
                PreparedStatement ps = con.prepareStatement("INSERT INTO " + tableNames[k] + "(Sno,Question,OptionA,OptionB,OptionC,OptionD,CorrectAnswer,Explanation) VALUES(?,?,?,?,?,?,?,?)");
                for (int i = 0; i < mCQData[k][0].length;i++)
                {
                    String question = mCQData[k][0][i];
                    String optionA = mCQData[k][1][i];
                    String optionB = mCQData[k][2][i];
                    String optionC = mCQData[k][3][i];
                    String optionD = mCQData[k][4][i];
                    String correctAnswer = mCQData[k][5][i];
                    String explanation = mCQData[k][6][i];
                    ps.setInt(1,i + 1);
                    ps.setString(2,question);
                    ps.setString(3,optionA);
                    ps.setString(4, optionB);
                    ps.setString(5, optionC);
                    ps.setString(6,optionD);
                    ps.setString(7, correctAnswer);
                    ps.setString(8, explanation);
                    ps.executeUpdate();
            }
            // ResultSet rs = st.executeQuery("Select * from " + tableNames[k] + ";");
            //     System.out.println(tableNames[k]);
            //     while(rs.next())
            //     {
            //         System.out.println("Question " + rs.getString(1));
            //         System.out.println(rs.getString(2));
            //         System.out.println(rs.getString(3));
            //         System.out.println(rs.getString(4));
            //         System.out.println(rs.getString(5));
            //         System.out.println(rs.getString(6));
            //         System.out.println(rs.getString(7));
            //         System.out.println(rs.getString(8));

            //     }
            // }
        }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
        
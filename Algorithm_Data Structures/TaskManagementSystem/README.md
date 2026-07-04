1. Understand Linked Lists
What is a Linked List?

A linked list is a linear data structure in which elements, called nodes, are stored in separate memory locations. Each node contains the data and a reference (link) to the next node. Unlike arrays, linked lists do not require contiguous memory.

Types of Linked Lists
1. Singly Linked List (SLL)
Each node contains:
Data
Pointer (reference) to the next node
Traversal is possible only in the forward direction.
Uses less memory than a doubly linked list.

Structure:

Head → [Data | Next] → [Data | Next] → [Data | Null]
2. Doubly Linked List (DLL)
Each node contains:
Data
Pointer to the previous node
Pointer to the next node
Supports traversal in both forward and backward directions.
Requires extra memory for the previous pointer.

Structure:

Null ← [Prev | Data | Next] ⇄ [Prev | Data | Next] → Null
2. Setup

Create a Task class with the following attributes:

taskId – Unique identifier of the task.
taskName – Name of the task.
status – Current status of the task (e.g., Pending, In Progress, Completed).

Each task is stored as a node in the linked list.

3. Implementation

A Singly Linked List is used to manage tasks.

The following operations are implemented:

Add Task: Inserts a new task into the linked list.
Search Task: Searches for a task using its task ID.
Traverse Tasks: Displays all tasks in the linked list.
Delete Task: Removes a task by task ID and updates the links between nodes.
4. Analysis
Time Complexity
Operation	Time Complexity	Explanation
Add Task (Beginning)	O(1)	Insert directly at the head of the list.
Add Task (End)	O(n)	Traverse to the last node before inserting.
Search Task	O(n)	Traverse the list until the task is found.
Traverse Tasks	O(n)	Visit each node once.
Delete Task	O(n)	Search for the node, then update the links.
Advantages of Linked Lists over Arrays
Dynamic Size: Linked lists can grow or shrink during runtime without needing a fixed size.
Efficient Insertions and Deletions: Adding or removing nodes does not require shifting elements, unlike arrays.
Better Memory Utilization: Memory is allocated only when a new node is created.
No Memory Wastage: There is no need to allocate a large block of memory in advance.
Limitations of Linked Lists
No direct access to elements; traversal is required to reach a specific node.
Extra memory is needed to store pointers (references).
Searching is slower than arrays because random access is not possible.
Poorer cache performance since nodes are not stored in contiguous memory.
When to Use Linked Lists

Linked lists are suitable when:

The number of elements changes frequently.
Frequent insertions and deletions are required.
The maximum size of the collection is unknown.

Linked lists are not recommended when:

Fast random access by index is required.
Memory usage needs to be minimized.
Frequent searching is performed, as it requires linear traversal

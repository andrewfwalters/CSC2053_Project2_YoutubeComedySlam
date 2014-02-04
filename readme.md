Project 2: Youtube Comedy Slam
==============================

Write a program that uses a symbol table to process a data set from the UCI Machine Learning Repository. The particular data set we will be using is the YouTube Comedy Slam Preference Data set.  
**YouTube Comedy Slam** is a video discovery experiment running on YouTube's version of labs (called TestTube) for a few months in 2011 and 2012. In this experiment, a pair of videos were shown to the user and the user was asked to vote for the video that they found funnier. Left/right positions of the videos were randomly selected before being presented to the user to eliminate position bias. Videos were selected from a large pool of weekly updated sets of videos. The dataset was donated to the UCI Machine Learning Repository for use in research and education. For more information and to download the dataset, refer to the repository links above.
The problem
-----------

Given a text file containing one entry per line for each vote, build a symbol table to keep track of each video and the number of votes that it received. Your input file will contain comma-separated data of the following form:

7VvBnz1Ngi4,1Y-Au-tnBLs,right
6L78MVrd14c,7zCIRPQ8qWc,right
7zCIRPQ8qWc,1Y-Au-tnBLs,left
...

the first two strings are the code for each video being compared and the third string is always either "left" or "right" to indicate the winner.There will be (many) repetitions of video codes, note, for example the green and red text in the sample above. 
Your program should output the number of videos being compared, the average number of votes, the number of votes received by the winner and the code for the winner. Optionally, your program can end by playing the winning video.

Implementation
--------------

This project can be implemented in a variety of ways, but to receive full credit, you must use symbol tables as we studied in class. In particular, you need to implement a modified version of BinarySearchST (as described below) and to test your implementation with this symbol table implementation.
**BinarySearchST** data type.  Modify the BinarySearchST data type that we studied to maintain one array of Item objects that contain keys and values, rather than two parallel arrays. Optional: Add a constructor that takes an array of Item values as argument and uses mergesort (use the version from the booksite or Arrasy.sort().
**YoutubeVideoEntry** data type.  Implement a data type to hold information about a video and the number of votes it has received. 
Testing
-------

Test your program with a small file (this is a small part of the actual dataset): comedy_comparisons_tiny.txt . Once it is working well, download and use the actuall dataset from the UCI Machine Learning Repository

Analysis of running time and memory usage (optional and not graded)
-------------------------------------------------------------------

Compare your implementation with other implementations of symbol tables from  algs4.jar. Use the stopwatch data type from the standard library to measure the total running time of your client with different sizes of input files (How does doubling N affect the total running time? ) 
Deliverables
------------

Submit the following files through the CSC Department website:

BinarySearchST.java (modified version using array of Item objects ) 
YoutubeVideoEntry.java 
YoutubeComedySlam.java
a readme.txt file, answering all questions. 
YoutubeComedySlam.doc A project report, including listings of the above files and sample runs (and/or screenshots) from your testing.
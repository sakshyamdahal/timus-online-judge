1100. Final Standings
Time limit: 1.0 second
Memory limit: 16 MB
Old contest software uses bubble sort for generating final standings. But now, there are too many teams and that software works too slow. You are asked to write a program, which generates exactly the same final standings as old software, but fast.
Input
The first line of input contains only integer 1 < N ≤ 150000 — number of teams. Each of the next N lines contains two integers 1 ≤ ID ≤ 107 and 0 ≤ M ≤ 100. ID — unique number of team, M — number of solved problems.
Output
Output should contain N lines with two integers ID and M on each. Lines should be sorted by M in descending order as produced by bubble sort (see below).
Sample
input	
8
1 2
16 3
11 2
20 3
3 5
26 4
7 1
22 4

output
3 5
26 4
22 4
16 3
20 3
1 2
11 2
7 1
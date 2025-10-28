
import sys

input = sys.stdin.read().split()
word1 = ''.join(filter(str.isalpha, input[0])).lower()
word2 = ''.join(filter(str.isalpha, input[1])).lower()
word3 = ''.join(filter(str.isalpha, input[2])).lower()
perm1 = word1 + word2 + word3
perm2 = word1 + word3 + word2
perm3 = word2 + word1 + word3
perm4 = word2 + word3 + word1
perm5 = word3 + word2 + word1
perm6 = word3 + word1 + word2
students = int(input[3])
for i in range(students):
    testCase = ''.join(filter(str.isalpha, input[4 + i])).lower()
    if testCase == perm1 or testCase == perm2 or testCase == perm3 or testCase == perm4 or testCase == perm5 or testCase == perm6:
        print("ACC")
    else:
        print("WA")


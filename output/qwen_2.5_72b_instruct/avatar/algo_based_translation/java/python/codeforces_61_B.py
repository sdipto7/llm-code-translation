import re

def main():
    import sys
    from sys import stdin

    in_ = sys.stdin.read().splitlines()

    word1 = re.sub(r'[^a-zA-Z]', '', in_[0]).lower()
    word2 = re.sub(r'[^a-zA-Z]', '', in_[1]).lower()
    word3 = re.sub(r'[^a-zA-Z]', '', in_[2]).lower()

    perm1 = word1 + word2 + word3
    perm2 = word1 + word3 + word2
    perm3 = word2 + word1 + word3
    perm4 = word2 + word3 + word1
    perm5 = word3 + word2 + word1
    perm6 = word3 + word1 + word2

    students = int(in_[3])

    for i in range(students):
        testCase = re.sub(r'[^a-zA-Z]', '', in_[4 + i]).lower()
        if testCase in {perm1, perm2, perm3, perm4, perm5, perm6}:
            print("ACC")
        else:
            print("WA")

if __name__ == "__main__":
    main()

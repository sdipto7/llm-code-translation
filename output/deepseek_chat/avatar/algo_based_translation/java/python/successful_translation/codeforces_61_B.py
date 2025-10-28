
import re

def main():
    import sys
    data = sys.stdin.read().splitlines()
    word1 = re.sub(r'[^a-zA-Z]', '', data[0]).lower()
    word2 = re.sub(r'[^a-zA-Z]', '', data[1]).lower()
    word3 = re.sub(r'[^a-zA-Z]', '', data[2]).lower()
    
    perm1 = word1 + word2 + word3
    perm2 = word1 + word3 + word2
    perm3 = word2 + word1 + word3
    perm4 = word2 + word3 + word1
    perm5 = word3 + word2 + word1
    perm6 = word3 + word1 + word2
    
    students = int(data[3])
    
    for i in range(4, 4 + students):
        test_case = re.sub(r'[^a-zA-Z]', '', data[i]).lower()
        if (test_case == perm1 or test_case == perm2 or test_case == perm3 or 
            test_case == perm4 or test_case == perm5 or test_case == perm6):
            print("ACC")
        else:
            print("WA")

if __name__ == "__main__":
    main()


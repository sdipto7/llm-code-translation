
import re

def main():
    in_data = input().strip()
    word1 = re.sub(r'[^a-zA-Z]', '', in_data).lower()
    in_data = input().strip()
    word2 = re.sub(r'[^a-zA-Z]', '', in_data).lower()
    in_data = input().strip()
    word3 = re.sub(r'[^a-zA-Z]', '', in_data).lower()
    
    perm1 = word1 + word2 + word3
    perm2 = word1 + word3 + word2
    perm3 = word2 + word1 + word3
    perm4 = word2 + word3 + word1
    perm5 = word3 + word2 + word1
    perm6 = word3 + word1 + word2
    
    students = int(input().strip())
    
    for _ in range(students):
        test_case = re.sub(r'[^a-zA-Z]', '', input().strip()).lower()
        if test_case in [perm1, perm2, perm3, perm4, perm5, perm6]:
            print("ACC")
        else:
            print("WA")

main()


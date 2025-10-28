
import re

word1 = re.sub(r'[^a-zA-Z]', '', input().strip()).lower()
word2 = re.sub(r'[^a-zA-Z]', '', input().strip()).lower()
word3 = re.sub(r'[^a-zA-Z]', '', input().strip()).lower()

permutations = [
    word1 + word2 + word3,
    word1 + word3 + word2,
    word2 + word1 + word3,
    word2 + word3 + word1,
    word3 + word2 + word1,
    word3 + word1 + word2
]

students = int(input())

for _ in range(students):
    test_case = re.sub(r'[^a-zA-Z]', '', input().strip()).lower()
    print("ACC" if test_case in permutations else "WA")



import re
from itertools import permutations

word1 = re.sub('[^a-zA-Z]', '', input()).lower()
word2 = re.sub('[^a-zA-Z]', '', input()).lower()
word3 = re.sub('[^a-zA-Z]', '', input()).lower()

perms = [''.join(p) for p in permutations([word1, word2, word3])]

n = int(input())

for _ in range(n):
    test = re.sub('[^a-zA-Z]', '', input()).lower()
    print('ACC' if test in perms else 'WA')


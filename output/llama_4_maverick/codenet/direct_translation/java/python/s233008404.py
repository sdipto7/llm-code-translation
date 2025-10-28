
import sys
from collections import defaultdict
from itertools import product

def main():
    h, w, k = map(int, sys.stdin.readline().split())
    color_mtr = [list(sys.stdin.readline().strip()) for _ in range(h)]
    ans = 0
    for h_pattern in product([0, 1], repeat=h):
        for w_pattern in product([0, 1], repeat=w):
            if judge(h_pattern, w_pattern, color_mtr, h, w, k):
                ans += 1
    print(ans)

def judge(h_pattern, w_pattern, color_mtr, h, w, k):
    black = 0
    for i in range(h):
        for j in range(w):
            if h_pattern[i] == 1 or w_pattern[j] == 1:
                continue
            if color_mtr[i][j] == '

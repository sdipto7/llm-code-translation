from sys import stdin
from itertools import product

class Atcoder_ABC128_C:
    def run(self):
        import sys
        input = sys.stdin.read().split()
        N = int(input[0])
        M = int(input[1])
        a = [0] * N
        index = 2
        for i in range(M):
            k = int(input[index])
            index += 1
            for j in range(k):
                s = int(input[index]) - 1
                index += 1
                a[s] |= (1 << i)
        p = 0
        for i in range(M):
            x = int(input[index])
            index += 1
            p |= (x << i)
        ans = 0
        for switches in product([0, 1], repeat=N):
            t = 0
            for i in range(N):
                if switches[i] == 1:
                    t ^= a[i]
            if t == p:
                ans += 1
        print(ans)

if __name__ == "__main__":
    main = Atcoder_ABC128_C()
    main.run()


import sys

class Main:
    def main(self):
        N, X = map(int, sys.stdin.readline().split())
        m = [0] * N
        m[0] = int(sys.stdin.readline())
        X -= m[0]
        min_val = m[0]
        for i in range(1, N):
            m[i] = int(sys.stdin.readline())
            X -= m[i]
            if m[i] < min_val:
                min_val = m[i]
        print(N + X // min_val)

if __name__ == "__main__":
    Main().main()


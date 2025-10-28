
import sys

class atcoder_AGC006_A:
    N = 210
    f = [0] * N
    b = [''] * N

    @staticmethod
    def get_fail(b, m):
        j = 0
        f = [0, 0]
        for i in range(2, m + 1):
            while j > 0 and b[j + 1] != b[i]:
                j = f[j]
            if b[j + 1] == b[i]:
                j += 1
            f.append(j)
        return f

    @staticmethod
    def main():
        in_ = sys.stdin
        n = int(in_.readline().strip())
        s1 = in_.readline().strip()
        s2 = in_.readline().strip()
        cnt = 0
        for i in range(n):
            atcoder_AGC006_A.b[cnt + 1] = s2[i]
            cnt += 1
        for i in range(n):
            atcoder_AGC006_A.b[cnt + 1] = s1[i]
            cnt += 1
        f = atcoder_AGC006_A.get_fail(atcoder_AGC006_A.b, cnt)
        len_ = min(f[len(f) - 1], n, n)
        print(2 * n - len_)

if __name__ == "__main__":
    atcoder_AGC006_A.main()


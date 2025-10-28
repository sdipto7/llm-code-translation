import sys

class atcoder_ABC119_B:
    @staticmethod
    def main():
        N = int(input().strip())
        x = []
        u = []
        for i in range(N):
            data = input().split()
            x.append(float(data[0]))
            u.append(data[1])
        result = atcoder_ABC119_B.solve(x, u)
        print(result)

    @staticmethod
    def solve(x, u):
        total = 0.0
        for i in range(len(x)):
            if u[i] == "JPY":
                total += x[i]
            else:
                total += x[i] * 380000.0
        return total

if __name__ == "__main__":
    atcoder_ABC119_B.main()

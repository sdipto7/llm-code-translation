
import math

class Main:
    def __init__(self):
        pass

    def findS(self, k, i):
        s = 0
        j = k
        while j % i == 0:
            j //= i
            s += 1
        return s

    def main(self):
        n = int(input())
        ans = 1
        mod = int(math.pow(10, 9)) + 7
        for i in range(2, n + 1):
            is_prime = True
            for j in range(2, i):
                if i % j == 0:
                    is_prime = False
                    break
            if is_prime:
                s = 0
                for k in range(1, n + 1):
                    s += self.findS(k, i)
                ans = (ans * (s + 1)) % mod
        print(ans)

if __name__ == "__main__":
    main_obj = Main()
    main_obj.main()


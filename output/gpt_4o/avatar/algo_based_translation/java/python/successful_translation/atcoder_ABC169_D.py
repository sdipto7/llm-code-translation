
import math

def atcoder_ABC169_D():
    n = int(input().strip())
    sqrt = int(math.sqrt(n))
    answer = 0

    for i in range(2, sqrt + 1):
        count = 0

        while n % i == 0:
            n //= i
            count += 1

        j = 1
        while count - j >= 0:
            count -= j
            answer += 1
            j += 1

    if n > 1:
        answer += 1

    print(answer)

if __name__ == "__main__":
    atcoder_ABC169_D()


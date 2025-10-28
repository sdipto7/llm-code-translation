
import math

class AtcoderABC123C:
    @staticmethod
    def main():
        N = int(input().strip())
        min_val = 0

        for i in range(5):
            current = int(input().strip())
            if i == 0:
                min_val = current
            else:
                min_val = min(min_val, current)

        result = math.ceil(N / min_val) + 4
        AtcoderABC123C.p(result)

    @staticmethod
    def p(ans):
        print(ans)

if __name__ == "__main__":
    AtcoderABC123C.main()


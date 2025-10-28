
class Main:
    @staticmethod
    def bubbleSort(a, n):
        flag = True
        count = 0
        while flag:
            flag = False
            for j in range(n-1, 0, -1):
                if a[j] < a[j-1]:
                    a[j], a[j-1] = a[j-1], a[j]
                    count += 1
                    flag = True
        return count

    @staticmethod
    def main():
        n = int(input())
        a = list(map(int, input().split()))
        count = Main.bubbleSort(a, n)
        print(' '.join(map(str, a)))
        print(count)

if __name__ == "__main__":
    Main.main()


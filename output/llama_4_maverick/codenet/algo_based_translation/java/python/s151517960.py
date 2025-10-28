
from collections import defaultdict

class Main:
    def main(self):
        n = int(input())
        freq_map = defaultdict(int)
        for _ in range(n):
            num = int(input().split()[0])
            freq_map[num] += 1
        ans = 0
        for key in freq_map:
            if freq_map[key] % 2 == 1:
                ans += 1
        print(ans)

if __name__ == "__main__":
    Main().main()


However, a more pythonic and idiomatic way to write this code would be:


from collections import Counter

def main():
    n = int(input())
    nums = [int(x) for x in input().split()]
    freq_map = Counter(nums)
    ans = sum(val % 2 for val in freq_map.values())
    print(ans)

if __name__ == "__main__":
    main()


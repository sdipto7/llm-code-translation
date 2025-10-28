from collections import defaultdict

def main():
    s = input().strip()
    char_count = defaultdict(int)
    for char in s:
        char_count[char] += 1
    odd_count = sum(val % 2 for val in char_count.values())
    if odd_count <= 1 or odd_count % 2 != 0:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()

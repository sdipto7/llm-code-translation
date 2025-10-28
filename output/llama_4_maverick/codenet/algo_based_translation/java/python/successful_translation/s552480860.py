
import sys

def calculate_time_difference(h1, m1, h2, m2, k):
    t1 = h1 * 60 + m1
    t2 = h2 * 60 + m2
    result = t2 - t1 - k
    return result

def main():
    inputs = sys.stdin.readline().split()
    h1, m1, h2, m2, k = map(int, inputs)
    result = calculate_time_difference(h1, m1, h2, m2, k)
    print(result)

if __name__ == "__main__":
    main()


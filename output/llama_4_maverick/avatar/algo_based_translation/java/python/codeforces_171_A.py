
class FastReader:
    def __init__(self):
        self.input_list = list(map(int, input().split()))

    def next_int(self):
        return self.input_list.pop(0)

def reverse(n):
    if n < 10:
        return n * 10
    r = 0
    t = n
    while t > 0:
        r = (r * 10) + t % 10
        t = t // 10
    return r

def main():
    input_str = input()
    input_list = list(map(int, input_str.split()))
    fr = FastReader()
    fr.input_list = input_list
    n = fr.next_int()
    m = fr.next_int()
    t = reverse(m)
    print(t + n)

if __name__ == "__main__":
    main()



import sys

def main():
    s = input().strip()
    vowels = {'a', 'e', 'i', 'o', 'u'}
    if s.lower() in vowels:
        print("vowel")
    else:
        print("consonant")

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def swap(self):
        return Pair(self.value, self.key)

if __name__ == "__main__":
    main()


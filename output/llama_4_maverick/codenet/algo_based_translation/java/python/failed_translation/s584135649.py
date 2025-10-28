
class Main:
    def main():
        i = 0
        i = 1
        while i <= 5:
            try:
                n = int(input())
                if n == 0:
                    break
            except ValueError:
                # In the original Java code, there's no error handling for non-integer input.
                # To maintain the same functionality, we can simply pass or continue.
                # However, to be more Pythonic, we should handle the potential exception.
                # For the sake of this conversion, we'll just pass.
                pass
            i += 1
        print(i)

if __name__ == "__main__":
    Main.main()


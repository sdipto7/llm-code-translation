class Main:
    @staticmethod
    def main(args):
        A = int(input())
        B = int(input())
        T = int(input())
        result = (T // A) * B
        Main.log(result)
    
    @staticmethod
    def log(str_param):
        print(str_param)

if __name__ == "__main__":
    import sys
    Main.main(sys.argv)

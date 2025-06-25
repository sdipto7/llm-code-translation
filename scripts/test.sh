WORKDIR=`pwd`
export PYTHONPATH=$WORKDIR;
export PYTHONIOENCODING=utf-8;

function prompt() {
    echo;
    echo "Syntax: bash scripts/test.sh MODEL DATASET SRC_LANG TRG_LANG TYPE";
    echo "MODEL: name of the model to use";
    echo "DATASET: name of the dataset to use";
    echo "SRC_LANG: source language";
    echo "TRG_LANG: target language";
    echo "TYPE: translation type";
    exit;
}

while getopts ":h" option; do
    case $option in
        h) # display help
          prompt;
    esac
done

if [[ $# < 5 ]]; then
  prompt;
fi

MODEL=$1;
DATASET=$2;
SRC_LANG=$3;
TRG_LANG=$4;
TYPE=$5;

if [[ $DATASET == "avatar" ]]; then
    python3 src/test/test_avatar.py --model $MODEL --source_lang $SRC_LANG --target_lang $TRG_LANG --translation_type $TYPE;
elif [[ $DATASET == "codenet" ]]; then
    python3 src/test/test_codenet.py --model $MODEL --source_lang $SRC_LANG --target_lang $TRG_LANG --translation_type $TYPE;
elif [[ $DATASET == "evalplus" ]]; then
    python3 src/test/test_evalplus.py --model $MODEL --source_lang $SRC_LANG --target_lang $TRG_LANG --translation_type $TYPE;
else
    echo "Dataset not supported";
fi
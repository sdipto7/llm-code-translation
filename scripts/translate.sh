WORKDIR=`pwd`
export PYTHONPATH=$WORKDIR;
export PYTHONIOENCODING=utf-8;

function prompt() {
    echo;
    echo "Syntax: bash scripts/translate.sh MODEL DATASET SRC_LANG TRG_LANG";
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

python3 src/translation/llm_translation.py --model $MODEL --dataset $DATASET --source_lang $SRC_LANG --target_lang $TRG_LANG --translation_type $TYPE;
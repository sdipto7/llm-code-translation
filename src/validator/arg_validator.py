import os
import logging
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.helper.constants import SUPPORTED_LLM_LIST, SUPPORTED_LANGUAGE_LIST

os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

def validate_model(model):
    logging.info("validating model")

    if model is None:
        raise ValueError("Model is not provided")

    if model not in SUPPORTED_LLM_LIST:
        raise ValueError(f"model {model} is not supported. should be one of {SUPPORTED_LLM_LIST}")

    logging.info("model validated successfully")

def validate_dataset(dataset):
    logging.info("validating dataset")

    if dataset is None:
        raise ValueError("Dataset is not provided")

    if dataset not in ["codenet", "avatar", "evalplus"]:
        raise ValueError(f"dataset {dataset} is not supported. should be one of [codenet, avatar, evalplus]")

    logging.info("dataset validated successfully")

def validate_source_language(source_lang):
    logging.info("validating source language")

    if source_lang is None:
        raise ValueError("Source language is not provided")

    if source_lang not in SUPPORTED_LANGUAGE_LIST:
        raise ValueError(f"source language {source_lang} is not supported. should be one of {SUPPORTED_LANGUAGE_LIST}")

    logging.info("source language validated successfully")

def validate_target_language(target_lang):
    logging.info("validating target language")

    if target_lang is None:
        raise ValueError("Target language is not provided")

    if target_lang not in SUPPORTED_LANGUAGE_LIST:
        raise ValueError(f"target language {target_lang} is not supported. should be one of {SUPPORTED_LANGUAGE_LIST}")

    logging.info("target language validated successfully")

def validate_language_pair(source_lang, target_lang):
    logging.info("validating language pair")

    if source_lang is None or target_lang is None:
        raise ValueError("Source language or target language is not provided")

    if source_lang in SUPPORTED_LANGUAGE_LIST and target_lang in SUPPORTED_LANGUAGE_LIST and source_lang == target_lang:
        raise ValueError(f"source language and target language can not be same")

    logging.info("language pair validated successfully")

def validate_translation_type(translation_type):
    logging.info("validating translation type")

    if translation_type is None:
        raise ValueError("Translation type is not provided")

    if translation_type not in ["algorithm", "direct"]:
        raise ValueError(f"translation type {translation_type} is not supported. should be one of [algorithm, direct]")

    logging.info("translation type validated successfully")

def validate_arguments(args, is_test=False):
    logging.info(f"validating arguments for the model {args.model}{', dataset ' + args.dataset if not is_test else ''}, source language {args.source_lang}, target language {args.target_lang} and translation type {args.translation_type}")

    validate_model(args.model)

    if not is_test:
        validate_dataset(args.dataset)

    validate_source_language(args.source_lang)
    validate_target_language(args.target_lang)
    validate_language_pair(args.source_lang, args.target_lang)
    validate_translation_type(args.translation_type)

    logging.info(f"arguments validated successfully with model: {args.model}{', dataset ' + args.dataset if not is_test else ''}, source language: {args.source_lang}, target language: {args.target_lang} and translation type: {args.translation_type}")

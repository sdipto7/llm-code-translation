def resolve_model_name_for_path(model_name):
    return model_name.rsplit("/")[-1].split(":")[0].replace("-", "_")
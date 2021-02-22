module impl {
  requires api;

  provides
    com.example.api.Messager
  with
    com.example.impl.HelloMessager;
}

def call(Map args) {
    build(
      job: "../test-jenkins-repo-submodules/master",
      parameters: [
        string(name: 'test_submodule', value: args.submodule)
      ],
      propagate: true,
    )
}

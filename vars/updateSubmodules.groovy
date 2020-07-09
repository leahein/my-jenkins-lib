def call(Map args) {
  build(
    job: '../test-jenkins-repo-submodules/master'
    parameters: [
      string(name: 'submodules', value: args.submodules)
    ],
    propagate: true,
  )

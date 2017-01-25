package modules

import com.google.inject.AbstractModule
import models.{UserRepo, UserRepoImpl}

class Models extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[UserRepo]).to(classOf[UserRepoImpl])
  }
}
